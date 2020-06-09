DROP TABLE SELLER;
DROP TABLE BUYER;
DROP TABLE GOODS;
SELECT*FROM SELLER;
SELECT*FROM BUYER;
SELECT*FROM GOODS;
SELECT *FROM GOODS;
CREATE TABLE GOODS (
         G_NAME NVARCHAR2(10),
         G_PRICE NUMBER(10),
         G_STOCK NUMBER(20),
         G_CODE NVARCHAR2 (20),
        CONSTRAINT G_CODE_PK PRIMARY KEY(G_CODE),
        CONSTRAINT G_NM_UN UNIQUE(G_NAME)
);
INSERT INTO GOODS
VALUES('아이폰7',100,10,'12345');

INSERT INTO GOODS
VALUES('아이폰20+',500,5,'56789');

INSERT INTO GOODS
VALUES('아이폰30+',1000,1,'91234');

CREATE TABLE SELLER (
         A_NUM NUMBER(20),
         A_BANNER NVARCHAR2(20),
         A_NAME NVARCHAR2(20),
         A_GDCD NVARCHAR2(20),
         CONSTRAINT A_GDCD_FK FOREIGN KEY(A_GDCD) REFERENCES GOODS(G_CODE)
);
INSERT INTO SELLER
VALUES(001,'APPLE','4조','12345');


CREATE TABLE BUYER (
         B_ID NVARCHAR2(20),
         B_PASSWORD NUMBER(20),
         B_NAME NVARCHAR2(20),
         B_PHONE NUMBER(20),
         B_GDCD NVARCHAR2(20),
         CONSTRAINT B_ID_PK PRIMARY KEY(B_ID),
         CONSTRAINT B_GDCD_FK FOREIGN KEY(B_GDCD) REFERENCES GOODS(G_CODE)
);
INSERT INTO BUYER
VALUES('HON123',1234,'차호정',01023456789,'12345');

INSERT INTO BUYER
VALUES('SOOL',1111,'이은솔',01011111111,'56789');

INSERT INTO BUYER
VALUES('SOO',2222,'강지수',01022222222,'91234');

INSERT INTO BUYER
VALUES('SANG',3333,'유제상',01033333333,'91234');


--------------------------------------------------------------------
--6.9--

/*
조인(JOIN) : 두개 이상의 테이블을 연결하여 하나의 테이블처럼 사용



*/

SELECT *FROM GOODS,SELLER;
SELECT*FROM GOODS;
SELECT*FROM SELLER;
--(1) INNER 조인(EUQI JOIN- 등가조인)
--    : 두개의 테이블의 열값이 같을때
SELECT*
FROM GOODS,SELLER
WHERE GOODS.G_CODE = SELLER.A_GDCD;

--(2)별칭을 이용해 표현하기
SELECT G_NAME,A_NAME
FROM GOODS G, SELLER S
WHERE G.G_CODE = S.A_GDCD;

--Q. 상품을 판매하는 판매자, 구입하는 사람을 조회
SELECT G_NAME AS 상품이름,A_NAME AS 판매자,B_NAME AS 구매자
FROM BUYER B, SELLER S, GOODS G
WHERE G.G_CODE = S.A_GDCD
AND G.G_CODE = B.B_GDCD;

--Q2. SCOTT계정을 사용해서 DEPT 테이블을 조회하고
--EMP 테이블과 JOIN해서 사원이름, 부서번호, 부서이름, 부서위치를 조회
SELECT *FROM EMP;
SELECT*FROM DEPT;
SELECT E.ENAME AS 사원이름, E.DEPTNO AS 부서번호, D.DNAME AS 부서이름, D.LOC AS 부서위치  --DEPTNO 는 EMP 랑DEPT 두개중 어디서 불러온지 온지 모른다 . 그래서 앞에 E. 이나 D.을 붙여준다.  
FROM DEPT D, EMP E
WHERE D.DEPTNO =E.DEPTNO;  

--Q3. 비등가조인(NON-EQUI JOIN) : 등가조인 외에 방식
--  :자주 사용하는 편은 아니지만, 조건이 특정 열의 일치 여부를 검사하는 방식

SELECT*FROM TAB;
--EMP ,DEPT, BONUS, SALGRADE
 SELECT*FROM SALGRADE;
 --1급 :LOSAL 700 HISAL 1200
 --2급 :LOSAL 1201 HISAL 1400
 --5급 :LOSAL 3001 HISAL 9999
SELECT*
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
--(4) 자체조인(SELF JOIN) : 하나의 테이블을 여러개 테이블처럼 활용하는 방식
SELECT*FROM EMP;
SELECT E1.ENAME AS 후배이름,E1.EMPNO AS 후배번호,E2.ENAME AS 선배이름,E2.EMPNO AS 선배번호
FROM EMP E1,EMP E2
WHERE E1.MGR = E2.EMPNO;
--13명 검색

--(5) 외부조인(OUTER JOIN)
    --: 조인 조건을 만족하지 않는 데이터를 처리하기 위한 것으로 
    --INNER JOIN이 두테이블에 있는 일치하는 값만 가져오는 것에 비히ㅐ
    --OUTER JOIN은 어느 한쪽의 데이터를 모두 가져온다.
    --:JOIN 기준 열의 NULL 을 처리하는 것을 목적으로 사용
    --: LEFT OTHER JOIN,RIGHT OUTER JOIN, FULL OUTER JOIN 
    
--LEFT JOIN 
/*
    첫번째 방법
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME]
    FROM [TAB_NAME1]LEFT OUTER JOIN [TAB_NAME2]
    ON [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME]
*/
    SELECT*
    FROM EMP E1 LEFT OUTER JOIN EMP E2
    ON E1.MGR =E2.EMPNO;
/*
   두번째 방법
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME],.....
    FROM [TAB_NAME1]. [TAB_NAME2]
    WHERE [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME](+)

*/
SELECT *
FROM EMP E1, EMP E2
WHERE  E1.MGR = E2.EMPNO(+);
--RIGHT JOIN 
/*
    첫번째 방법
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME]
    FROM [TAB_NAME1]RIGHT OUTER JOIN [TAB_NAME2]
    ON [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME]
*/
SELECT*
    FROM EMP E1 RIGHT OUTER JOIN EMP E2
    ON E1.MGR =E2.EMPNO;
/*
   두번째 방법
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME],.....
    FROM [TAB_NAME1]. [TAB_NAME2]
    WHERE [TAB_NAME1].[COL_NAME](+) = [TAB2_NAME].[COL_NAME]

*/
SELECT *
FROM EMP E1, EMP E2
WHERE  E1.MGR(+) = E2.EMPNO;

--(6) 서브쿼리 :SQL 문을 실행하는데 필요한 데이터를 추가로 조회하기 위해
        --SQL문 내부에서 SELECT 문을 사용
        
--Q1. 사원이름이 JONES인 사원의 급여를 출력
    SELECT SAL AS "JONES의 급여"
    FROM EMP 
    WHERE ENAME = 'JONES';
    --2975
--Q2. 급여가 2975 보다 높은 급여를 받는 사원정보 출력
SELECT 
*FROM EMP
WHERE SAL >2975;

--Q3. JONES의 급여보다 높은 급여를 받는 사원정보 출력( Q1 + Q2 )
SELECT 
*FROM EMP
WHERE SAL > (SELECT SAL FROM EMP 
                WHERE ENAME='JONES');
  /*
    -서브 쿼리의 특징
    1. 서브쿼리는 연산자와 같은 비교 또는 조회 대상으 ㅣ오른쪽에 놓이며 괄호() 로 묶어서 사용한다.
    2. 특수한 몇몇 경우를 제외하고 서브쿼리는 ORDER BY절을 사용할 수 없다.
    3. 서브쿼리의 SELECT 절에 명시한 열(오른쪽SAL)은 메인쿼리의 비교대상(왼쪽SAL)과 
        같은 자료형과 같은 개수로 지정해야 한다.
        
    
  */          
  /*
  
  --서브쿼리 안에 함수를 사용한 경우
  --Q. 받는 급여가 평균 급여이상인 정보를 검새하시오
  
  */
SELECT  *
FROM EMP
  WHERE SAL>=(SELECT AVG(SAL)
                FROM EMP);--2073
                
    --서버쿼리 IN 연산자 : 메인쿼리의 데이터가 서브쿼리의 결과 중 하나라도 일치하는 
                    --데이터가 있다면 TRUE
                    
--Q. 각부서별 최고급여와 동일 급여를 받는 사원

SELECT *FROM EMP
WHERE SAL IN (SELECT MAX(SAL)
                FROM EMP 
                GROUP BY DEPTNO);
                --10:5000
                --20:3000
                --30:2850
                
--안에꺼를 이렇게 빼서 확인해볼 수 있다.
--SELECT DEPTNO, MAX(SAL)
--FROM EMP 
--GROUP BY DEPTNO;

--다중열 서브쿼리
SELECT* FROM EMP
WHERE (DEPTNO,SAL ) IN(SELECT DEPTNO, MAX(SAL)
                        FROM EMP
                        GROUP BY DEPTNO);


----------
SELECT *FROM EMP;
SELECT *FROM EMP
ORDER BY JOB DESC ,ENAME ASC;       


-----
SELECT*FROM EMP;
SELECT*FROM DEPT;
EMP DEPT 
DEPTNO 
 
SELECT*
    FROM EMP E1 LEFT OUTER JOIN DEPT E2
    ON E1.DEPTNO = E2.DEPTNO
    ORDER BY EMPNO ASC;
               
SELECT*FROM EMP;  
SELECT ENAME, TO_CHAR (HIREDATE,'YY/MM/DD')
FROM EMP
WHERE HIREDATE >'81/06/09';
SELECT *FROM ENAME, TO_CHAR (HIREDATE, 'YY/MM/DD')
WHERE HIREDATE >'81//06/09';
SELECT *
FROM   EMP
WHERE HIREDATE <;

SELECT*FROM EMP
WHERE HIREDATE >'81/06/09';