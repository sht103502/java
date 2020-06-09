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
VALUES('������7',100,10,'12345');

INSERT INTO GOODS
VALUES('������20+',500,5,'56789');

INSERT INTO GOODS
VALUES('������30+',1000,1,'91234');

CREATE TABLE SELLER (
         A_NUM NUMBER(20),
         A_BANNER NVARCHAR2(20),
         A_NAME NVARCHAR2(20),
         A_GDCD NVARCHAR2(20),
         CONSTRAINT A_GDCD_FK FOREIGN KEY(A_GDCD) REFERENCES GOODS(G_CODE)
);
INSERT INTO SELLER
VALUES(001,'APPLE','4��','12345');


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
VALUES('HON123',1234,'��ȣ��',01023456789,'12345');

INSERT INTO BUYER
VALUES('SOOL',1111,'������',01011111111,'56789');

INSERT INTO BUYER
VALUES('SOO',2222,'������',01022222222,'91234');

INSERT INTO BUYER
VALUES('SANG',3333,'������',01033333333,'91234');


--------------------------------------------------------------------
--6.9--

/*
����(JOIN) : �ΰ� �̻��� ���̺��� �����Ͽ� �ϳ��� ���̺�ó�� ���



*/

SELECT *FROM GOODS,SELLER;
SELECT*FROM GOODS;
SELECT*FROM SELLER;
--(1) INNER ����(EUQI JOIN- �����)
--    : �ΰ��� ���̺��� ������ ������
SELECT*
FROM GOODS,SELLER
WHERE GOODS.G_CODE = SELLER.A_GDCD;

--(2)��Ī�� �̿��� ǥ���ϱ�
SELECT G_NAME,A_NAME
FROM GOODS G, SELLER S
WHERE G.G_CODE = S.A_GDCD;

--Q. ��ǰ�� �Ǹ��ϴ� �Ǹ���, �����ϴ� ����� ��ȸ
SELECT G_NAME AS ��ǰ�̸�,A_NAME AS �Ǹ���,B_NAME AS ������
FROM BUYER B, SELLER S, GOODS G
WHERE G.G_CODE = S.A_GDCD
AND G.G_CODE = B.B_GDCD;

--Q2. SCOTT������ ����ؼ� DEPT ���̺��� ��ȸ�ϰ�
--EMP ���̺�� JOIN�ؼ� ����̸�, �μ���ȣ, �μ��̸�, �μ���ġ�� ��ȸ
SELECT *FROM EMP;
SELECT*FROM DEPT;
SELECT E.ENAME AS ����̸�, E.DEPTNO AS �μ���ȣ, D.DNAME AS �μ��̸�, D.LOC AS �μ���ġ  --DEPTNO �� EMP ��DEPT �ΰ��� ��� �ҷ����� ���� �𸥴� . �׷��� �տ� E. �̳� D.�� �ٿ��ش�.  
FROM DEPT D, EMP E
WHERE D.DEPTNO =E.DEPTNO;  

--Q3. ������(NON-EQUI JOIN) : ����� �ܿ� ���
--  :���� ����ϴ� ���� �ƴ�����, ������ Ư�� ���� ��ġ ���θ� �˻��ϴ� ���

SELECT*FROM TAB;
--EMP ,DEPT, BONUS, SALGRADE
 SELECT*FROM SALGRADE;
 --1�� :LOSAL 700 HISAL 1200
 --2�� :LOSAL 1201 HISAL 1400
 --5�� :LOSAL 3001 HISAL 9999
SELECT*
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
--(4) ��ü����(SELF JOIN) : �ϳ��� ���̺��� ������ ���̺�ó�� Ȱ���ϴ� ���
SELECT*FROM EMP;
SELECT E1.ENAME AS �Ĺ��̸�,E1.EMPNO AS �Ĺ��ȣ,E2.ENAME AS �����̸�,E2.EMPNO AS �����ȣ
FROM EMP E1,EMP E2
WHERE E1.MGR = E2.EMPNO;
--13�� �˻�

--(5) �ܺ�����(OUTER JOIN)
    --: ���� ������ �������� �ʴ� �����͸� ó���ϱ� ���� ������ 
    --INNER JOIN�� �����̺� �ִ� ��ġ�ϴ� ���� �������� �Ϳ� ������
    --OUTER JOIN�� ��� ������ �����͸� ��� �����´�.
    --:JOIN ���� ���� NULL �� ó���ϴ� ���� �������� ���
    --: LEFT OTHER JOIN,RIGHT OUTER JOIN, FULL OUTER JOIN 
    
--LEFT JOIN 
/*
    ù��° ���
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME]
    FROM [TAB_NAME1]LEFT OUTER JOIN [TAB_NAME2]
    ON [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME]
*/
    SELECT*
    FROM EMP E1 LEFT OUTER JOIN EMP E2
    ON E1.MGR =E2.EMPNO;
/*
   �ι�° ���
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME],.....
    FROM [TAB_NAME1]. [TAB_NAME2]
    WHERE [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME](+)

*/
SELECT *
FROM EMP E1, EMP E2
WHERE  E1.MGR = E2.EMPNO(+);
--RIGHT JOIN 
/*
    ù��° ���
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME]
    FROM [TAB_NAME1]RIGHT OUTER JOIN [TAB_NAME2]
    ON [TAB_NAME1].[COL_NAME] = [TAB2_NAME].[COL_NAME]
*/
SELECT*
    FROM EMP E1 RIGHT OUTER JOIN EMP E2
    ON E1.MGR =E2.EMPNO;
/*
   �ι�° ���
    SELECT[TAB_NAME ] .[COL_NAME]. [TAB_NAME2].[COL_NAME],.....
    FROM [TAB_NAME1]. [TAB_NAME2]
    WHERE [TAB_NAME1].[COL_NAME](+) = [TAB2_NAME].[COL_NAME]

*/
SELECT *
FROM EMP E1, EMP E2
WHERE  E1.MGR(+) = E2.EMPNO;

--(6) �������� :SQL ���� �����ϴµ� �ʿ��� �����͸� �߰��� ��ȸ�ϱ� ����
        --SQL�� ���ο��� SELECT ���� ���
        
--Q1. ����̸��� JONES�� ����� �޿��� ���
    SELECT SAL AS "JONES�� �޿�"
    FROM EMP 
    WHERE ENAME = 'JONES';
    --2975
--Q2. �޿��� 2975 ���� ���� �޿��� �޴� ������� ���
SELECT 
*FROM EMP
WHERE SAL >2975;

--Q3. JONES�� �޿����� ���� �޿��� �޴� ������� ���( Q1 + Q2 )
SELECT 
*FROM EMP
WHERE SAL > (SELECT SAL FROM EMP 
                WHERE ENAME='JONES');
  /*
    -���� ������ Ư¡
    1. ���������� �����ڿ� ���� �� �Ǵ� ��ȸ ����� �ӿ����ʿ� ���̸� ��ȣ() �� ��� ����Ѵ�.
    2. Ư���� ��� ��츦 �����ϰ� ���������� ORDER BY���� ����� �� ����.
    3. ���������� SELECT ���� ����� ��(������SAL)�� ���������� �񱳴��(����SAL)�� 
        ���� �ڷ����� ���� ������ �����ؾ� �Ѵ�.
        
    
  */          
  /*
  
  --�������� �ȿ� �Լ��� ����� ���
  --Q. �޴� �޿��� ��� �޿��̻��� ������ �˻��Ͻÿ�
  
  */
SELECT  *
FROM EMP
  WHERE SAL>=(SELECT AVG(SAL)
                FROM EMP);--2073
                
    --�������� IN ������ : ���������� �����Ͱ� ���������� ��� �� �ϳ��� ��ġ�ϴ� 
                    --�����Ͱ� �ִٸ� TRUE
                    
--Q. ���μ��� �ְ�޿��� ���� �޿��� �޴� ���

SELECT *FROM EMP
WHERE SAL IN (SELECT MAX(SAL)
                FROM EMP 
                GROUP BY DEPTNO);
                --10:5000
                --20:3000
                --30:2850
                
--�ȿ����� �̷��� ���� Ȯ���غ� �� �ִ�.
--SELECT DEPTNO, MAX(SAL)
--FROM EMP 
--GROUP BY DEPTNO;

--���߿� ��������
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