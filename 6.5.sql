
/*
6.4일 학습한 내용 정리
(1) UPPER, LOWER, INITCAP : 대소문자 구분
(2) LENGTH, LENGTHB : 문자열의 길이와 크기
(3) SUBSTR : 문자열 일부 추출
(4) INSTR : 문자열 위치 찾기
(5) REPLACE : 다른문자로 바꾸기
(6) CONCAT : 두컬럼 데이터를 합치기
(7) LPAD, RPAD : 빈공간 채우기
*/
 
/*
1. EMP테이블에서 직원넘버 7839의 부하직원인 사람들을 호출한다.
호출시 부서넘버를 말한뒤 이름을 부룬다. 별칭은 '호출'을 사용한다.
(EX. 00번 부서의 XXXX님! 사장실로 와주세요!)
조건1. 데이터를 합칠경우 무조건 CONCAT만을 사용한다.
조건2. 이름을 부를 때 첫문자는 대문자로, 나머지는 소문자로 변환한다.
조건3. 부서번호를 낮은 순서대로 정렬하여 호출한다.
*/
SELECT (DEPTNO || '번의 부서의 ' || INITCAP(ENAME) || '님! 사장실로 와주세요')
AS "호출" FROM EMP WHERE MGR = 7839 ORDER BY DEPTNO ASC;

/*
1. JSSTU테이블에서 지각한 사람들을 호출한다.
호출시 조를 말한뒤 이름을 부룬다. 별칭은 '원장님 호출'을 사용한다.
(EX. 00조의 XXXX님! 원장실로 와주세요!)
조건1. 데이터를 합칠경우 (1)CONCAT (2) || 사용
조건2. 생년월일이 빠른 순서대로 정렬하여 호출한다
 자신의 조가 지각했다는 가정하에
*/
SELECT * FROM TAB;
SELECT GROUPNO || '조의 ' || STUNAME || '님! 원장실로 와주세요!' AS "원장님 호출" 
FROM JSSTU WHERE GROUPNO = 5 ORDER BY STUBIRTH ASC;

-- (1) 집합
-- A집합 : 4조인 사람 (4명)
SELECT * FROM JSSTU WHERE GROUPNO=4;
-- B집합 : 성이 '이'씨인 사람 (5명)
SELECT * FROM JSSTU WHERE STUNAME LIKE '이%';

-- INTERSECT(교집합) : 결과값이 같은 데이터만 출력
SELECT * FROM JSSTU WHERE GROUPNO=4 
INTERSECT
SELECT * FROM JSSTU WHERE STUNAME LIKE '이%';
 
-- UNION(합집합) : 모든 결과 데이터 출력
SELECT * FROM JSSTU WHERE GROUPNO=4 
UNION
SELECT * FROM JSSTU WHERE STUNAME LIKE '이%';
 
-- MINUS(차집합) : 먼저 작성한 SELECT문에서 나중에 작성한
-- SELECT문의 데이터를 빼고 출력
SELECT * FROM JSSTU WHERE GROUPNO=4 
MINUS
SELECT * FROM JSSTU WHERE STUNAME LIKE '이%';

-- (2) 공백제거 : TRIM( ), LTRIM( ), RTRIM( )
SELECT TRIM('   ICIA교육원   ') AS TRIM,
       LTRIM('  ICIA교육원   ') AS LTRIM,
       RTRIM('  ICIA교육원   ') AS RTRIM
FROM DUAL;

-- (3) 절댓값 : ABS( )
SELECT 
    ABS(5) AS "절댓값5", 
    ABS(-10) AS "절댓값-10"
FROM DUAL;
 
-- (4) 반올림 : ROUND( )
-- 반올림은 자바에서 동일하게 적용가능

SELECT ROUND(1234.5678) AS ROUND, -- 정수부분까지만 나타냄(소수점 첫째자리에서 반올림)
       ROUND(1234.5678, 0) AS ROUND_0, -- 정수부분까지만 나타냄(소수점 첫째자리에서 반올림) 
       ROUND(1234.5678, 1) AS ROUND_1, -- 소수점 첫째자리까지만 나타냄(소수점 둘째자리에서 반올림)
       ROUND(1234.5678, 2) AS ROUND_2, -- 소수점 둘째자리까지만 나타냄(소수점 셋째자리에서 반올림)
       ROUND(1234.5678, -1) AS ROUND_MINUS1, -- (정수 첫번째자리에서 반올림)
       ROUND(1234.5678, -2) AS ROUND_MINUS2  -- (정수 둘번째자리에서 반올림)
FROM DUAL;
 -- 내 전화번호 반올림 확인해보기 4123.5789
--0, 1, 2, 3, -1, -2, -3
SELECT ROUND(4123.5789, 0) AS ROUND_0,
       ROUND(4123.5789, 1) AS ROUND_1,
       ROUND(4123.5789, 2) AS ROUND_2,
       ROUND(4123.5789, 3) AS ROUND_3,
       ROUND(4123.5789, -1) AS ROUND_MINUS1,
       ROUND(4123.5789, -2) AS ROUND_MINUS2,
       ROUND(4123.5789, -3) AS ROUND_MINUS3
FROM DUAL;
-- (5) 버림 : TRUNC
SELECT TRUNC(1234.5678) AS TRUNC,
       TRUNC(1234.5678, 0) AS TRUNC_0,
       TRUNC(1234.5678, 1) AS TRUNC_1,
       TRUNC(1234.5678, 2) AS TRUNC_2,
       TRUNC(1234.5678, -1) AS TRUNC_MINUS1,
       TRUNC(1234.5678, -2) AS TRUNC_MINUS2
FROM DUAL; 
-- (6) 가까운 정수 찾기 : CEIL(본인보다 큰), FLOOR(본인보다 작은)
SELECT CEIL(3.14),
       FLOOR(3.14),
       CEIL(-3.14),
       FLOOR(-3.14)
FROM DUAL;
-- (7) 나머지 값 구하기 : MOD(NUM1, NUM2)
-- NUM1 % NUM2
SELECT
    FLOOR(15/6) AS "15/6",
    MOD(15,6) AS"15%6"
FROM DUAL;
-- 1년은 몇주로 되어있는지 구해보시오.
SELECT FLOOR(365/7) AS "1년은 몇주?"
FROM DUAL;
-- (8) 날짜 관련 함수
-- DATE DATA + 숫자 : 숫자만큼 이후 날짜
-- DATE DATA - 숫자 : 숫자만큼 이전 날짜
-- DATE DATA1 - DATE DATA2 : 두 날짜간 일수 차이
-- DATE DATA1 + DATE DATA2 : 연산 불가능
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD';
SELECT 
SYSDATE AS "NOW(오늘)",
SYSDATE+1 AS "TOMORROW(내일)",
SYSDATE-1 AS "YESTERDAY(어제)"
FROM DUAL;
-- 오늘, 일주일전, 일주일후 구하기
SELECT
SYSDATE AS "NOW(오늘)",
SYSDATE-7 AS "LASTWEEK(지난주)",
SYSDATE+7 AS "NEXTWEEK(다음주)"
FROM DUAL; 
-- (9) 개월 수 구하기 : MONTHS_BETWEEN( )
-- 큰 날짜, 작은 날짜 순으로
SELECT CEIL(MONTHS_BETWEEN('2020/10/23','2020/05/01')) AS "개월 수"
FROM DUAL;
-- (10) 개월 수 더하기 : ADD_MONTHS( )
SELECT ADD_MONTHS(SYSDATE, 5)
FROM DUAL;
-- (11) 다가올 요일에 해당하는 날짜 : NEXT_DAY( )
SELECT NEXT_DAY(SYSDATE, '수요일') AS "돌아오는 수요일"
FROM DUAL;
SELECT NEXT_DAY(SYSDATE, '일요일') AS "돌아오는 일요일"
FROM DUAL;
 
-- (12) 이번달/ 특정달의 마지막 일수 : LAST_DAY( )
SELECT LAST_DAY(SYSDATE) FROM DUAL;
 
-- 2020년 2월 마지막날을 출력!
-- SYSDATE에 '2020/06/05'의 형태 사용
SELECT LAST_DAY('2020/02/01') AS "2020년 2월 마지막날" FROM DUAL;

-- (13)
--      1) TO_CHAR : 숫자 또는 날짜를 문자데이터로 전환
--          ex) String.valueOf(100)
--      2) TO_NUMBER : 문자를 숫자로
--          ex) Integer.parseInt("100")
--      3) TO_DATE : 문자를 숫자로 
SELECT TO_CHAR(SYSDATE, 'MM-DD DAY') FROM DUAL;
-- DATE FORMAT(날짜형식)
-- TO_CHAR(SYSDATE, 'YYYYMMDD') : 20200605
SELECT TO_CHAR(SYSDATE, 'YYYYMMDD') AS "YYYYMMDD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY-MM-DD') : 2020-06-05
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS "YYYY-MM-DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY/MM/DD') : 2020/06/05
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') AS "YYYY/MM/DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY') : 2020
SELECT TO_CHAR(SYSDATE, 'YYYY') AS "YYYY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YY') : 20 (뒤)
SELECT TO_CHAR(SYSDATE, 'YY') AS "YY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'MM') : 06
SELECT TO_CHAR(SYSDATE, 'MM') AS "MM" FROM DUAL;
-- TO_CHAR(SYSDATE, 'MON') : 6월 
SELECT TO_CHAR(SYSDATE, 'MON') AS "MON" FROM DUAL;
-- TO_CHAR(SYSDATE, 'D') : 6   -- 일주일 기준 일수(일요일=1)
SELECT TO_CHAR(SYSDATE, 'D') AS "D" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DD') : 05
SELECT TO_CHAR(SYSDATE, 'DD') AS "DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DDD') : 157  -- 1년 기준 일수
SELECT TO_CHAR(SYSDATE, 'DDD') AS "DDD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DAY') : 금요일
SELECT TO_CHAR(SYSDATE, 'DAY') AS "DAY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DY') : 금
SELECT TO_CHAR(SYSDATE, 'DY') AS "DY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'WW') : 23  -- 1년 기준 주차
SELECT TO_CHAR(SYSDATE, 'WW') AS "WW" FROM DUAL;
-- TO_CHAR(SYSDATE, 'W') : 1  -- 한달 기준 주차
SELECT TO_CHAR(SYSDATE, 'W') AS "W" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DL') : 2020년 6월 5일 금요일  -- 해당지역 날짜형식
SELECT TO_CHAR(SYSDATE, 'DL') AS "DL" FROM DUAL;

-- 시간형식
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD HH24:MI:SS';

-- TO_CHAR(SYSDATE, 'AM') -- 오전
-- TO_CHAR(SYSDATE, 'PM') -- 오후
-- TO_CHAR(SYSDATE, 'HH') -- 11(시) // 오후1시 : 01시
-- TO_CHAR(SYSDATE, 'HH24') -- 11(시) // 오후1시 : 13시
-- TO_CHAR(SYSDATE, 'MI') -- 37(분)
-- TO_CHAR(SYSDATE, 'SS') -- 54(초)
SELECT SYSDATE AS "현재시간", -- 현재
 TO_CHAR(SYSDATE, 'HH')AS "12시간기준",
 TO_CHAR(SYSDATE, 'HH24')AS "24시간기준",
 TO_CHAR(SYSDATE, 'MI')AS "분",
 TO_CHAR(SYSDATE, 'SS')AS "초"
 FROM DUAL;
-- 오전 11:42:14 출력(SYSDATE)
--SELECT TO_CHAR(SYSDATE, 'AM HH24:MI:SS') FROM DUAL;

-- 세기
-- TO_CHAR(SYSDATE, 'CC') -- 21세기
-- TO_CHAR(SYSDATE, 'BC') -- 서기
SELECT TO_CHAR(SYSDATE, 'CC') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'BC YYYY') FROM DUAL;
-- (15) NULL 처리 함수 : NVL, NVL2
--      NVL([COL_NAME], 0) : 컬럼에 데이터가 NULL일 경우 0으로 바꾼다.
--      NVL2([COL_NAME], 'NULL값이 아닐경우', 'NULL일 경우')
-- AB테이블 생성
CREATE TABLE AB(
    ABNAME NVARCHAR2(10),
    ABAGE NUMBER(5),
    ABMERRY NVARCHAR2(5)
);
 -- 데이터 삽입
INSERT INTO AB(ABNAME)
VALUES ('HWANG');
 INSERT INTO AB
VALUES ('YANG', 35, 'X');
-- AB테이블 조회
SELECT * FROM AB;
SELECT ABNAME, NVL(ABAGE, 999) AS "나이NULL여부", ABMERRY FROM AB;
 SELECT ABNAME,
       NVL2(ABAGE, 111, 222) AS "나이NULL",
       NVL2(ABMERRY, 'NULL이 아닐 때 호출', 'NULL일때 호출')
FROM AB;
-- NVL 출력시에는 보이지만 실제 테이블에는 값이 비어있다.
 -- (16) SWITCH문 : DECODE
SELECT ENAME, 
       DECODE(DEPTNO, 10, '인사팀',
                      20, '영업팀',
                      30, '홍보팀'
                )
FROM EMP;
SELECT ENAME, DEPTNO,
    CASE
        WHEN DEPTNO = 10 THEN '인사팀'
        WHEN DEPTNO = 20 THEN '영업팀'
        WHEN DEPTNO = 30 THEN '홍보팀'
    END AS 담당부서
FROM  EMP
ORDER BY DEPTNO;

--(18) 그룹화 함수 
--SUM( ) : 지정한 컬럼 데이터의 합
--AVG( ) : 지정란 컬럼 데이터의 평균
--COUNT( ) : 지정한 컬럼 데이터의 갯수
--MAX ( ) : 지정한 컬럼의 데이터중 최댓값
--MIN ( ) : 지정한 컬럼의 데이터중 최솟값

SELECT SUM(SAL) AS 급여합계, SUM(DISTINCT(SAL)) AS "얘는 뭘까요?",
        SUM(ALL(SAL)) AS "그럼 얘는?"
 FROM EMP;
 
 --부서가 20번인 사람들 급여의 합계와 평균급여를 조회하고,
 --가장 많은 급여를 받는 사람과 가장적은 급여를 받는 사람을 조회하시오.
 --(SELECT 1번 사용)
--서브쿼리 사용
 SELECT ENAME,SAL
 FROM EMP
 WHERE SAL = (SELECT MAX(SAL)
                FROM EMP);

SELECT ENAME,SAL
 FROM EMP
 WHERE SAL = (SELECT MIN(SAL)
                FROM EMP);
 
 
 