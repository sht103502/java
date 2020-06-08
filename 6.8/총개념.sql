--
--(1)테이블 구성 살펴보기
SELECT *FROM TABLE
--(2)ALIAS(별칭)으로 조회하기
 SELECT [COL_NAME] AS 별칭 
 FROM TABLE;
--(3)중복 데이터를 제거 DISTINCT
SELECT COL_NAME FROM TABLE;
--(4)정렬하기
--1)오름차순 ASC
SELECT DISTINCT COL_NAME FROM TABLE -- DISTINCT는 중복제거
ORDER BY COL_NAME ASC;--올림차순, 올림차순은 ORDER BY 안써도 된다.
--2)내림차순 DESC
SELECT DISTINCT COL_NAME FROM TABLE
ORDER BY COL_NAME DESC;--내림차순
--(5) 조건검색
SELECT COL_NAME
FROM TABLE
WHERE (조건식)

--(6) 두가지 이상 조건 검색
--1)AND
--2)OR
SELECT COL_NAME 
FROM TABLE
1)WHERE 조건식1 AND 조건식2 -> 모두 참일 때 TRUE, 하나라도 거짓이면 FALSE
2)WHERE 조건식1 OR 조건식2 -> 모두 거짓일 때 FALSE, 하나라도 참이면 TRUE
--(7) 산술연산, 문자연산
SELECT *
FROM TABLE
WHERE COL_NAME 조건식

SELECT *
FROM TABLE
WHERE COL_NAME 조건식1(산술연산+ 문자연산) AND COL_NAME 조건식2(산술연산+ 문자연산);조건식1부터 조건식2전까지 
예) WHERE STUNAME >='김'AND STUNAME<='이';--김씨부터 이씨전까지
--(8) IN 연산자
--같은 컬럼에서 여러가지 조건검색
SELECT*
FROM DUAL
1)WHERE COL_NAME IN (COL_NAME에 속한 데이터);-> COL_NAME 에서 속한데이터를 검색해준다
2)WHERE COL_NAME NOT IN (COL_NAME에 속한 데이터);-> COL_NAME 에서 속하지 않은 데이터를 검색해준다
--(9)BTWEEN A AND B
--A 부터 B사이의 데이터를 검색
 SELECT *
    FROM [TABLE_NAME]
    WHERE [COL_NAME] BETWEEN 최솟값 AND 최댓값;
--(10) LIKE, 와일드 카드
SELECT *
FROM DUAL
WHERE [COL_NAME] LIKE(COL_NAME 에 속한 데이터);
--와일드 카드
--_ : 어떤 값이든 상관없이 한개의 문자 데이터를 의미
--%: 길이랑 상관없이 (문자 없는경우도 포함) 모든 문자 데이터를 의미
--(11) IS NULL /IS NOT NULL
 IS NULL :비어져있다.
 IS NOT NULL : 비어있지않다, 채워져있다.

--
6.4일 학습한 내용 정리
(1) UPPER, LOWER, INITCAP : 대소문자 구분

SELECT UPPER ('문자들') AS "UPPER(대문자)"-> 모든 문자들이 대문자로 출력
FROM DUAL;
SELECT LOWER ('문자들') AS "LOWER(소문자)"-> 모든문자들이 소문자로 출력
FROM DUAL;
SELECT INITCAP ('문자들') AS "INITCAP(첫글자 대문자)"-> 첫글자만 대문자로 출력
FROM DUAL;
(2) LENGTH, LENGTHB : 문자열의 길이와 크기
SELECT LENGTH('AbC/dE_Fg') AS 문자열길이
FROM DUAL;

SELECT LENGTHB('가') AS 한글, LENGTHB('a') AS 소문자,
LENGTHB('A') AS 대문자 FROM DUAL;


(3) SUBSTR : 문자열 일부 추출
SELECT ('문자열데이터' OR [COL_NAME],시작위치,추출길이)
        ('문자열데이터' OR [COL_NAME],시작위치)
FROM DUAL;
(4) INSTR : 문자열 위치 찾기
SELECT INSTR('문자열데이터' OR [COL_NAME], 
    '위치를 찾으려는 부분 문자'.
시작위치(기본값 1), 같은 문자일 때 몇번째 문자인지(기본값 1))
FROM DUAL;
(5) REPLACE : 다른문자로 바꾸기
SELECT
REPLACE('문자데이터' OR[COL_NAME],찾는 문자,바꿀 문자)
REPLACE('문자데이터' OR[COL_NAME],찾는 문자);
FROM DUAL;
(6) CONCAT : 두컬럼 데이터를 합치기
SELECT CONCAT(COL_NAME,COL_NAME),
       CONCAT(COL_NAME,CONCAT(':',COL_NAME))
FROM DUAL;
SELECT COL_NAME || COL_NAME AS 별칭1, COL_NAME || ':' || COL_NAME AS 별칭2
FROM DUAL;

(7) LPAD, RPAD : 빈공간 채우기
LPAD('문자열',데이터자릿수,빈공간에 채울문자(기본값''))
RPAD('문자열',데이터자릿수,빈공간에 채울문자(기본값''))

--<6/5>--
-- (1) 집합 
교집합 INTERSECT: 결과값이 같은 데이터만 출력
합집합 UNION : 모든 결과 데이터 출력
차집합 MINUS : 먼저 작성한 SELECT문에서 나중에 작성한 SELECT문의 데이터를 빼고 출력
-- (2) 공백제거 : TRIM( ), LTRIM( ), RTRIM( )
SELECT TRIM('   문장 ') AS TRIM,공백제거
       LTRIM('  문장   ') AS LTRIM, 왼쪽 공백제거
       RTRIM('  문장    ') AS RTRIM 오른쪽 공백제거
FROM DUAL;
-- (3) 절댓값 : ABS( )
SELECT 
    ABS(5) AS "절댓값5", 
    ABS(-10) AS "절댓값-10"
FROM DUAL;
-- (4) 반올림 : ROUND( )
SELECT ROUND(1234.5678, 0) AS ROUND_0, --1235 정수부분까지만 나타냄(소수점 첫째자리에서 반올림) 
       ROUND(1234.5678, 1) AS ROUND_1, --1234.6 소수점 첫째자리까지만 나타냄(소수점 둘째자리에서 반올림)
       ROUND(1234.5678, 2) AS ROUND_MINUS2,--1200 (정수 둘번째자리에서 반올림)
FROM DUAL;
-- (5) 버림 : TRUNC
SELECT TRUNC(1234.5678) AS TRUNC,--1234 
       TRUNC(1234.5678, 0) AS TRUNC_0,--1234
       TRUNC(1234.5678, 1) AS TRUNC_1,--1234.5
       TRUNC(1234.5678, 2) AS TRUNC_2,--1234.56
       TRUNC(1234.5678, -1) AS TRUNC_MINUS1,--1230
       TRUNC(1234.5678, -2) AS TRUNC_MINUS2--1200
FROM DUAL; 
-- (6) 가까운 정수 찾기 : CEIL(본인보다 큰), FLOOR(본인보다 작은)
SELECT CEIL(3.14),--4   
       FLOOR(3.14),--3
       CEIL(-3.14),-- -3
       FLOOR(-3.14)-- -4
FROM DUAL;
-- (7) 나머지 값 구하기 : MOD(NUM1, NUM2)
-- (8) 날짜 관련 함수
-- (9) 개월 수 구하기 : MONTHS_BETWEEN( )
-- (10) 개월 수 더하기 : ADD_MONTHS( )
-- (11) 다가올 요일에 해당하는 날짜 : NEXT_DAY( )
-- (12) 이번달/ 특정달의 마지막 일수 : LAST_DAY( )
-- (13) ★DATE FORMAT(날짜형식)
    -- 1) TO_CHAR : 숫자 또는 날짜를 문자데이터 전환
    -- 2) TO_NUMBER : 문자를 숫자데이터로 전환
    -- 3) TO_DATE : 문자를 날짜데이터로 전환
    
-- (14) DATE FORMAT(시간형식, 세기형식)
-- (15) NULL 처리 함수 : NVL, NVL2
-- (16) SWITCH문 : DECODE
-- (17) IF~ELSE : CASE~WHEN
-- (18) 그룹화 함수
    -- SUM( ) : 지정한 컬럼 데이터의 합
    -- AVG( ) : 지정한 컬럼 데이터의 평균
    -- COUNT( ) : 지정한 컬럼 데이터의 갯수
    -- MAX( ) : 지정한 컬럼의 데이터중 최댓값
    -- MIN( ) : 지정한 컬럼의 데이터중 최솟값
    
-- <6월 8일 수업>
-- (1) GROUP BY : 특정 컬럼 또는 데이터를 기준으로 데이터를 그룹으로 묶음
/*
    SELECT
    FROM 
    WHERE
    GROUP BY [그룹화할 COLUMN을 지정(여러개 가능)]
    ORDER BY [정렬할 COLUMN];
    
(ORDER BY는 GROUP BY 밑에 작성할 수 있다)
*/
 
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
 
-- 직책별(JOB)로 인원수, 급여합계, 급여평균을 구하시오.
SELECT JOB, COUNT(*), SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY JOB;
 
-- 인원이 많은 순으로 정렬
SELECT JOB, COUNT(*), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
GROUP BY JOB
ORDER BY COUNT(*) DESC;
 
 
-- (2) ROLLUP : 그룹화 데이터의 합계를 함께 출력
/*
    SELECT
    FROM
    WHERE
    GROUP BY ROLLUP [COL_NAME]
*/
SELECT JOB, COUNT(*), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
GROUP BY ROLLUP(JOB);
 
-- (3) HAVING : GROUP BY 절을 사용해 그룹화 된 결과 중
--                출력 그룹을 선별하는 조건식
/*
★
    SELECT
    FROM 
    WHERE
    GROUP BY 
    HAVING [출력그룹을 제한하는 조건식]
    ORDER BY;
*/
SELECT DEPTNO, COUNT(*)
FROM EMP
WHERE SAL>1500
GROUP BY DEPTNO
HAVING DEPTNO >= 20;

SELECT*FROM EMP
ORDER BY DEPTNO;
--WHERE 절 조건 다음에 HAVING절 조건


--Q1 .EMP테이블을 이용해서 부서번호(DEPTNO),평균급여(AVG),
--최고 급여(MAX) ,최저 급여(MIN), 사원수 (COUNT)를 출력
--단 평균급여를 출력할때 소숫점을 제외 하고 각 부서번호 별로 출력
SELECT *FROM EMP;
SELECT DEPTNO AS 부서번호 , 
       ROUND(AVG(SAL)) AS 평균급여 ,  -- ROUND 말고 TRUNC써도 됌
       MAX(SAL) AS 최고급여,
       MIN(SAL) AS 최저급여, 
       COUNT(*) AS 사원수
FROM EMP
GROUP BY  DEPTNO --부서별로 출력
ORDER BY DEPTNO;

--Q2 같은 직급 (JOB)에 종사하는 사원이 3명 이상인 직급과 인원수 출력

SELECT JOB, COUNT (JOB) -- 직급과 직급의 수
FROM EMP
GROUP BY JOB;--JOB을 그룹화 시킨다.
HAVING COUNT(*) >=3; --그룹화된 데이터에 조건식을 단다.

--Q3 사원들의입사 연도를 기준으로 부서별로 몇명이 입사했는지 출력
SELECT *FROM EMP;
SELECT TO_CHAR (HIREDATE,'YYYY')AS 입사년도, --HIREDATE를 문자형으로 만들어준다
       DEPTNO AS 부서번호,
       COUNT(*) AS 사원수
FROM EMP
GROUP BY TO_CHAR (HIREDATE,'YYYY'), DEPTNO --입사년도를 그룹화시켜준다
ORDER BY TO_CHAR (HIREDATE,'YYYY');--입사년도를 정렬을 시켜준다 

--Q4 추가 수당(COMM)을 받는 사원수와 받지 않는 사원수 출력
--COMM을 받으면 0 ,받지않으면 X출력( NVL2)
SELECT NVL2(COMM, 'O','X') AS 수당여부,
       COUNT (*) AS 사원수
FROM EMP
GROUP BY NVL2(COMM, 'O','X');--NULL값이 아닌경우 ,NULL값인 경우-> 수당이 받는경우 O ,수당이 받지않는 NULL이면 X 가 나온다.
--Q5각 부서의 입사 연도별 사원수, 최고급여, 급여합
--평균급여를 출력하고 각 부서별 소계와 총계를 출력하세요(ROLLUP)
SELECT DEPTNO AS 부서번호,
       TO_CHAR(HIREDATE, 'YYYY') AS 입사년도, --입사년도를 문자형으로 바꿔준다
       COUNT(*) AS 사원수,
       MAX(SAL) AS 최고급여,
       SUM(SAL) AS 급여합계,
       ROUND(AVG(SAL)) AS 급여평균 -- 소수점 버려준다
FROM EMP 
GROUP BY ROLLUP(DEPTNO, TO_CHAR(HIREDATE,'YYYY')); -- 부서번호와 년도 그룹화를 시킨다.
