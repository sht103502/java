-- <6월 5일 학습한 내용 복습>
-- (1) 집합
-- (2) 공백제거 : TRIM( ), LTRIM( ), RTRIM( )
-- (3) 절댓값 : ABS( )
-- (4) 반올림 : ROUND( )
-- (5) 버림 : TRUNC
-- (6) 가까운 정수 찾기 : CEIL(본인보다 큰), FLOOR(본인보다 작은)
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

--CONSTRAINT(제약조건)
--: 테이블의 특정 컬럼에 지정, 제약조건에 부합하지 않은 데이터는 저장 불가

/*
무결성 제약조건 : 데이터 무결성은 데이터베이스에 저장된 데이터의 일관성과 정확성을 지키는 것을 말한다.
                일관성과 정확성을 잃어 버린 데이터베이스는 정보로서의 가치에 심각한문제가 있다.*/
1)영역 무결성(Domain integrity)
    -도메인 제약, 릴레이션 내의 튜플들이 각 속성의 도메인에 지정된 값만 가져야 한다.
2) 개체 무결성(Entity integrity)
    -기본키(PK) 제약, 릴레이션에 기본키를 지정하고, 그에 따른 무결성 원칙
     기본키는 NULL을 가져서는 안되고, 릴레이션 내에 오직 하나의 값만 존재
3) 참조 무결성(Referential integrity)
    -외래키(FK) 제약, 릴레이션 간의 참조 관계를 선언하는 제약조건
    -일반적으로 참조되는 릴레이션을 부모 릴레이션
     참조하는 릴레이션을 지식 릴레이션이라고 한다.
/*
--1. PRIMARY KEY(기본키)
    : 하나의 테이블에서 레코드를 구분 지을 수 있는 특정 컬럼의 유일값
    :NOT NULL + UNIQUE
    주민번호(SSN),학생번호(STU_CODE), 핸드폰번호(PHONE), NAVER ID
    
  2. NOT NULL
    : 하나의 테이블에서 특정 컬럼의 값을 반드시 입력해야 하는 제약
    :NULL값이 혀용되지 않는다.
    
  3. UNIQUE
    : 하나의 테이블에서 특정 컬럼의 값이 중복되는 것을 방지하는 제약
    : 단, NULL은 무제한 허용
    
  4. DEFAULT 
    : 초기값, 컬럼의 입력되는 데이터가 없더라도 미리 약속된 값으로
      자동 입력하는 제약

  5. CHECK
    :특정 범위의 데이터만 입력 가능하도록 하는 제약
    EX) JS_PASSWORD  NUMBER(4)
*/
SELECT *FROM TAB;
DROP TABLE AB;
DROP TABLE JSMEMBER;
DROP TABLE JSS;
DROP TABLE JSSTU;
DROP TABLE STUDENT ;
DROP TABLE TEST_TB;


    CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11)
    );
    -- JS_CODE를 기본키 (PK)지정
    ALTER TABLE JS_MEMBERS
    ADD CONSTRAINT JS_CD_PK
    PRIMARY KEY(JS_CODE);
/*
    ALTER TABLE [TAB _NAME]
    ADD CONSTRAINT [CONST_NAME]
    PRIMARY KEY[COL_NAME];
*/
--제약조건 조회
SELECT*FROM USER_CONSTAINT;
--OWNER :제약조건 소유 계정
--CONSTRAINT_NAME :제약조건 이름(자동 지정되기도 함)
--CONSTAINT_TYPEl
    C : CHECK, NOT NULL
    U : UNIQUE
    P : PRIMARY KEY
    R : FOREIN KEY
TABLE NAME: 제약조건을 지정한 테이블
INSERT INTO JS_MEMBERS
VALUES('JS001', '신희태', '1111','01026983756');

INSERT INTO JS_MEMBERS
VALUES('JS001', '이유진', '1234','0101234567');
--PK중 UNIQUE 조건 위배로 삽입불가

INSERT INTO JS_MEMBER(JS_NAME, JS_PASSWORD, JS_PHONE)
VALUES ('오리온', '0000','01011111111');
--PK조건중 NOT NULL 조건 위배로 삽입 불가
--PK 지정방법(2)
DROP TABLE JS_MEMBERS;

CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5) PRIMARY KEY,
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11)
        
    );
--PK 지정방법(3)    
DROP TABLE JS_MEMBERS;
    CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11),
        CONSTRAINT JS_CD_PK PRIMARY KEY(JS_CODE)
    );
    SELECT * FROM USER_CONSTRAINTS;
--제약조건 이름 정하기
--(TABLE_NAME) 약자_(COLUMEN_NAME)약자_CONSTRAINT_TYPE
--JS_CD_PK : JS_MEMEBERS 테이블의 JS_CODE 컬럼이 PK 다.

--제약조건 수정하기
ALTER TABLE JS_MEMBERS
MODIFY CONSTIRAINT JS_CD_PK
PRIMARY KEY(JS_NAME);
ALTER TABLE RENAME JS_MEMBERS TO JSCODE
 rename column A to B

--제약조건 삭제하기
ALTER TABLE JS_MEMBERS
DROP CONSTRAINT JS_CD_PK;


--(2) NOT NULL;

--NOT NULL지정 방법(1)
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE        NVARCHAR2(11)
        );
ALTER TABLE JS_MEMBERS
MODIFY JS_PASSWORD NOT NULL;

SELECT*FROM USER_CONSTRAINTS;
--NOT NULL 지정방법(2)
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4)NOT NULL,
        JS_PHONE NVARCHAR2(11)
        );
        
INSERT INTO JS_MEMBERS
VALUES('JS001', '신희태',1111,'0101234567');

INSERT INTO JS_MEMBERS(JS_CODE,JS_NAME,JS_PHONE)
VALUES('JS001', '이유진','0102345678');

INSERT INTO JS_MEMBERS(JS_PASSWORD)
VALUES(1234);

INSERT INTO JS_MEMBERS(JS_CODE, JS_PASSWORD)
VALUES('JS001',1111);

SELECT*FROM JS_MEMBERS;

--(3) UNIQUE
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11) UNIQUE 
        );
INSERT INTO JS_MEMBERS
VALUES('JS001','신희태',1234,'4100');

INSERT INTO JS_MEMBERS
VALUES('JS002','이유진',1111,'4100');
--UNIQUE(중복)으로 인한 제약조건 위배

--(4) DEFAULT 계약조건
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4) DEFAULT 1234,
        JS_PHONE NVARCHAR2(11) 
        );
INSERT INTO JS_MEMBERS(JS_CODE)
VALUES('JS001'); 

INSERT INTO JS_MEMBERS(JS_CODE,JS_PASSWORD)
VALUES('JS002',1111);


INSERT INTO JS_MEMBERS(JS_CODE,JS_PASSWORD)
VALUES('JS003',DEFAULT);

INSERT INTO JS_MEMBERS(JS_CODE,JS_PASSWORD)
VALUES('JS004',NULL);

SELECT *FROM JS_MEMBERS;
--(5) CHECK 제약조건
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11),
        CONSTRAINT JS_PS_CK CHECK (LENGTH(JS_PASSWORD) >= 3)
        
        );
INSERT INTO JS_MEMBERS(JS_PASSWORD)
VALUES(1234);
INSERT INTO JS_MEMBERS(JS_PASSWORD)
VALUES(123);
INSERT INTO JS_MEMBERS(JS_PASSWORD)
VALUES(12);--PASSWORD 가 3자리 이상인 CHECK 제약조건 위배 
SELECT *FROM JS_MEMBERS; 

--여러가지 제약조건
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4)DEFAULT 1234 NOT NULL,
        JS_PHONE NVARCHAR2(11),
        CONSTRAINT JS_PS_CK CHECK (LENGTH(JS_PASSWORD) >= 3)
);
SELECT *FROM USER_CONSTRAINTS; 

INSERT INTO JS_MEMBERS(JS_CODE)
VALUES ('JS001');

SELECT * FROM JS_MEMBERS;

--------------------------------------------------------
SELECT* FROM JMEMBERS;
DROP TABLE JMEMBERS;
DROP TABLE ADDLISTS;
--JSMEMBERS 테이블 생성
CREATE TABLE JMEMBERS(
    J_ID NVARCHAR2(20),
    J_NAME NVARCHAR2(5),
    J_BIRTH DATE
);
--제약조건 추가(PK,기본키)
ALTER TABLE JMEMBERS
ADD CONSTRAINT J_ID_PK PRIMARY KEY(J_ID);
--데이터 삽입1
INSERT INTO JMEMBERS
VALUES ('J001','신희태','1995/11/28');

INSERT INTO JMEMBERS
VALUES ('J001','이유진','1994/10/11'); --ORA-00001 : 중복 입력불가

INSERT INTO JMEMBERS
VALUES ('J002','이유진','1994/10/11'); 

--배송지  테이블 생성
DROP TABLE ADDLISTS;
CREATE TABLE ADDLISTS(
    A_JID NVARCHAR2(20),
    A_ADDR NVARCHAR2(100)
);
--제약조건 추가(FK, 왜래키)
ALTER TABLE ADDLISTS
ADD CONSTRAINT A_JID_FK FOREIGN KEY (A_JID)
REFERENCES JMEMBERS(J_ID); --J_ID와 A_ID의 데이터타입과 크기가 같아야 한다.

INSERT INTO ADDLISTS
VALUES ('J001', '인천');

INSERT INTO ADDLISTS
VALUES ('J001', '부천');

INSERT INTO ADDLISTS
VALUES ('J001', '시흥');

SELECT * FROM ADDLISTS;

INSERT INTO ADDLISTS
VALUES ('J002', '서울');

INSERT INTO ADDLISTS
VALUES ('J003', '부산');
--오류 보고 -
--ORA-02291: integrity constraint (SHINHEETAE.A_JID_FK) violated - parent key not found

DROP TABLE JMEMBERS ;
/*
주문시스템 설계
ENTITY:
1.SELLER (판매자)
-사업자 등록 번호(A_NUM), 상호(A_BANNER), 대표자(A_NAME)

2.GOODS(상품)
-상품이름(G_NAME), 가격(G_PRICE),재고(G_STOCK) 

3.BUYER(구매자)
-아이디(B_ID), 비밀번호(B_PASSWORD), 이름(B_NAME), 연락처(B_PHONE)

--각각 알맞은 제약조건 설정 하기
-설정한 테이블 맞춰 데이터 삽입하기

*/
DROP TABLE SELLER;
CREATE TABLE SELLER (
         A_NUM NUMBER(10),
         A_BANNER NVARCHAR2(20),
         A_NAME NVARCHAR2(10)
);
ALTER TABLE SELLER
ADD CONSTRAINT A_NUM_PK PRIMARY KEY(A_NUM);
INSERT INTO SELLER
VALUES('001','APPLE','4조');
CREATE TABLE GOODS (
         G_NAME NVARCHAR2(10),
         G_PRICE NUMBER(10),
         G_STOCK NUMBER(20)
         
);
ALTER TABLE GOODS
ADD CONSTRAINT G_NAME_PK PRIMARY KEY(G_NAME);
INSERT INTO GOODS
VALUES('아이폰7',100,10);

INSERT INTO GOODS
VALUES('아이폰20+',500,5);

INSERT INTO GOODS
VALUES('아이폰30+',1000,1);

CREATE TABLE BUYER (
         B_ID NVARCHAR2(10),
         B_PASSWORD NUMBER(10),
         B_NAME NVARCHAR2(10),
         B_PHONE NUMBER(20)
);
ALTER TABLE BUYER
ADD CONSTRAINT B_ID_PK PRIMARY KEY(B_ID);
INSERT INTO BUYER
VALUES('HON123',1234,'차호정',01023456789);

INSERT INTO BUYER
VALUES('SOOL',1111,'이은솔',01011111111);

INSERT INTO BUYER
VALUES('SOO',2222,'강지수',01022222222);

INSERT INTO BUYER
VALUES('SANG',3333,'유제상',01033333333);
SELECT *FROM SELLER;
SELECT *FROM BUYER;
SELECT *FROM GOODS;
---
DROP TABLE SELLER;
DROP TABLE BUYER;
DROP TABLE GOODS;
----
