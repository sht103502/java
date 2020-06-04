/*

Date : 2020.06.04

Author : 신희태

Description : 오라클 함수
Version : 1.0

*/



/*
    (1) 대, 소문자를 바꿔주는 함수
        - UPPER : 모두 대문자로
        - LOWER : 모두 소문자로
        - INITCAP : 첫글자 대문자, 나머지는 소문자
*/    

SELECT UPPER ('AbCdEfG') AS "UPPER(대문자)"
FROM DUAL;
 

SELECT LOWER('AbCdEfG') AS "LOWER(소문자)"
FROM DUAL;
 
SELECT INITCAP ('AbCdEfG') AS "INITCAP(첫글자 대문자)"
FROM DUAL;

 

/*
    (2) 문자열 길이를 구하는 LENGTH
*/    

SELECT LENGTH('AbCdEfG') AS 문자열길이
FROM DUAL;

 
SELECT LENGTH('$_$') AS 특수문자열길이
FROM DUAL;

 

-- EMP 테이블에서 이름이 5자 이상인 직원 조회
SELECT ENAME, LENGTH(ENAME)
FROM EMP WHERE LENGTH(ENAME) >= 5;
 
-- LENGTHB : 문자의 크기 조회(byte)
SELECT LENGTHB('가') AS 한글, LENGTHB('a') AS 소문자, LENGTHB('A') AS 대문자
FROM DUAL;
 
-- !, #, _, ,
SELECT LENGTHB('!') AS "!", LENGTHB('#') AS "#",
LENGTHB('_') AS "_", LENGTHB(' ') AS " " FROM DUAL;

 

/*
    (3) 문자열 일부를 추출하는 SUBSTR  
    SUBSTR('문자열데이터' OR [COL_NAME], 시작위치, 추출길이)
    SUBSTR('문자열데이터' OR [COL_NAME], 시작위치)

*/
SELECT JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5) FROM EMP;
SELECT 'HELLO!!', SUBSTR('HELLO!!', 1, 2), SUBSTR('HELLO!!', 3, 2), SUBSTR('HELLO!!', 5) FROM DUAL;

 

/*
    (4) 문자열 데이터 안에서 특정 문자 위치를 찾는 INSTR  
    INSTR('문자열데이터' OR [COL_NAME],
          '위치를 찾으려는 부분 문자',
           시작위치(기본값1),
           같은 문자일 때 몇번째 문자인지(기본값1))  

*/
SELECT 'HELLO, ORACLE!',
INSTR('HELLO, ORACLE!', 'L') AS INSTR1,
INSTR('HELLO, ORACLE!', 'L', 5) AS INSTR2,
INSTR('HELLO, ORACLE!', 'L', 2, 3) AS INSTR3
FROM DUAL;
 

SELECT 'HELLO, ORACLE!',
INSTR('HELLO, ORACLE!', 'O', 1, 1) AS INSTR1,
INSTR('HELLO, ORACLE!', 'O', 1, 2) AS INSTR2
FROM DUAL;

 

/*
    (5) 특정문자를 다른 문자로 바꾸는 REPLACE
    REPLACE ('문자데이터' OR [COL_NAME], 찾는 문자, 바꿀문자)
    REPLACE ('문자데이터' OR [COL_NAME], 찾는 문자);
*/

-- WEB에서 휴대전화 입력할 때 다양한 입력 방법
SELECT 
'010-1234-2345' AS "REPLACE이전",
REPLACE ('010-1234-2345', '-', ' ') AS "REPLACE기본형",
REPLACE ('010-1234-2345', '-') AS "REPLACE선택형"
FROM DUAL;

-- 류현진 이후 첫 진기록... 소형준, 던지면서 더 강해진다
-- 류현진 => 김혁, 소형준 => 김성진

SELECT
    REPLACE ( 
        REPLACE ('류현진 이후 첫 진기록... 소형준, 던지면서 더 강해진다', '류현진', '김혁'),
'소형준', '김성진') AS "기사제목수정"
FROM DUAL;

 

/*
    (6) 두 컬럼 데이터를 합치는 CONCAT
*/

SELECT CONCAT (EMPNO, ENAME),
        CONCAT (EMPNO, CONCAT(' : ', ENAME))

FROM EMP;

SELECT EMPNO || ENAME AS CONCAT1,
        EMPNO || ' : ' || ENAME AS CONCAT2

FROM EMP;
-- || 은 CONCAT의 역할을 감당하는 약자로 생각
-- JOB이 SALESMAN인 사원 이름 앞에
-- '힘내세요' 문자 붙여주기

SELECT '힘내세요 ' || ENAME AS 사원이름
FROM EMP
WHERE JOB = 'SALESMAN';

 

/*
    (7) 데이터의 빈 공간을 특정 문자로 채우는
        LPAD, RPAD
        
    LPAD('문자열', 데이터자릿수, 빈공간에 채울문자(기본값 ' '))
    RPAD('문자열', 데이터자릿수, 빈공간에 채울문자(기본값 ' '))

*/
 
SELECT 'ICIA',
        LPAD('ICIA', 7, '#') AS LPAD1,
        RPAD('ICIA', 7, '*') AS RPAD1,
        LPAD('ICIA', 7) AS LPAD2,
        RPAD('ICIA', 7) AS RPAD2
FROM DUAL;

-- 1) 주민번호 980328-1******
SELECT RPAD('951128-1',14,'*') AS 주민번호
FROM DUAL;
--다른 방식으로 
SELECT RPAD(SUBSTR('951128-1',1,8), 14, '*') AS 주민번호
FROM DUAL;
------------------------
SELECT RPAD(SUBSTR(SSN,1,8), 14, '*') AS 주민번호
FROM JJJSSS;

DROP TABLE JJJSSS;

CREATE TABLE JJJSSS(
    JSNAME NVARCHAR2(3),
    SSN NVARCHAR2(14),
    JSSPHONE NVARCHAR2(13)
);
--INSERT INTO JJJSSS VALUES ('신희태', '951128-1234567');
--INSERT INTO JJJSSS VALUES ('신희주', '951128-2234567');

INSERT INTO JJJSSS VALUES ('신희태', '951128-1234567','010-1234-5678');
INSERT INTO JJJSSS VALUES ('신희주', '951128-2234567','010-2345-6789');

SELECT *FROM JJJSSS;
------
-- 2) 전화번호 010-****-2837
SELECT RPAD( SUBSTR(JSPHONE,1,4), 8, '*'||SUBSTR(JSPHONE, 9)AS 전화번호)
FROM JJJSSS;
----------------내가 내보는 문제-------
--문제1)
--문자열데이터 2개가 있다. 이2개의 문자열데이터 안에서 1을 찾아 몇번째 인지 출력하라.
--llllllll1,llllllll1llll1lllll 
SELECT 'llllllll1', 'llllllll1llll1lllll',
INSTR('llllllll1', '1', 1, 1) AS 숫자1의위치,
INSTR('llllllll1llll1lllll', '1', 1, 2) AS 숫자1의위치_1
FROM DUAL;

--2번문제 
--문자 크기를 출력해 더 높은 문자열을 말해보라
-- LENGTHB : 문자의 크기 조회(byte)
--아름다운이강산(한글), WHATISYOURNAME(영어), ?,?是?(중국어)
SELECT LENGTHB('아름다운이강산') AS 한글, LENGTHB('WHATISYOURNAME') AS 영어, LENGTHB('?,?是?') AS 중국어
FROM DUAL;


