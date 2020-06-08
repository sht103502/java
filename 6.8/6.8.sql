-- <6�� 5�� �н��� ���� ����>
-- (1) ����
-- (2) �������� : TRIM( ), LTRIM( ), RTRIM( )
-- (3) ���� : ABS( )
-- (4) �ݿø� : ROUND( )
-- (5) ���� : TRUNC
-- (6) ����� ���� ã�� : CEIL(���κ��� ū), FLOOR(���κ��� ����)
-- (7) ������ �� ���ϱ� : MOD(NUM1, NUM2)
-- (8) ��¥ ���� �Լ�
-- (9) ���� �� ���ϱ� : MONTHS_BETWEEN( )
-- (10) ���� �� ���ϱ� : ADD_MONTHS( )
-- (11) �ٰ��� ���Ͽ� �ش��ϴ� ��¥ : NEXT_DAY( )
-- (12) �̹���/ Ư������ ������ �ϼ� : LAST_DAY( )
-- (13) ��DATE FORMAT(��¥����)
    -- 1) TO_CHAR : ���� �Ǵ� ��¥�� ���ڵ����� ��ȯ
    -- 2) TO_NUMBER : ���ڸ� ���ڵ����ͷ� ��ȯ
    -- 3) TO_DATE : ���ڸ� ��¥�����ͷ� ��ȯ
    
-- (14) DATE FORMAT(�ð�����, ��������)
-- (15) NULL ó�� �Լ� : NVL, NVL2
-- (16) SWITCH�� : DECODE
-- (17) IF~ELSE : CASE~WHEN
-- (18) �׷�ȭ �Լ�
    -- SUM( ) : ������ �÷� �������� ��
    -- AVG( ) : ������ �÷� �������� ���
    -- COUNT( ) : ������ �÷� �������� ����
    -- MAX( ) : ������ �÷��� �������� �ִ�
    -- MIN( ) : ������ �÷��� �������� �ּڰ�
 
 
-- <6�� 8�� ����>
-- (1) GROUP BY : Ư�� �÷� �Ǵ� �����͸� �������� �����͸� �׷����� ����
/*
    SELECT
    FROM 
    WHERE
    GROUP BY [�׷�ȭ�� COLUMN�� ����(������ ����)]
    ORDER BY [������ COLUMN];
    
(ORDER BY�� GROUP BY �ؿ� �ۼ��� �� �ִ�)
*/
 
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
 
-- ��å��(JOB)�� �ο���, �޿��հ�, �޿������ ���Ͻÿ�.
SELECT JOB, COUNT(*), SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY JOB;
 
-- �ο��� ���� ������ ����
SELECT JOB, COUNT(*), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
GROUP BY JOB
ORDER BY COUNT(*) DESC;
 
 
-- (2) ROLLUP : �׷�ȭ �������� �հ踦 �Բ� ���
/*
    SELECT
    FROM
    WHERE
    GROUP BY ROLLUP [COL_NAME]
*/
SELECT JOB, COUNT(*), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
GROUP BY ROLLUP(JOB);
 
-- (3) HAVING : GROUP BY ���� ����� �׷�ȭ �� ��� ��
--                ��� �׷��� �����ϴ� ���ǽ�
/*
��
    SELECT
    FROM 
    WHERE
    GROUP BY 
    HAVING [��±׷��� �����ϴ� ���ǽ�]
    ORDER BY;
*/
SELECT DEPTNO, COUNT(*)
FROM EMP
WHERE SAL>1500
GROUP BY DEPTNO
HAVING DEPTNO >= 20;

SELECT*FROM EMP
ORDER BY DEPTNO;
--WHERE �� ���� ������ HAVING�� ����


--Q1 .EMP���̺��� �̿��ؼ� �μ���ȣ(DEPTNO),��ձ޿�(AVG),
--�ְ� �޿�(MAX) ,���� �޿�(MIN), ����� (COUNT)�� ���
--�� ��ձ޿��� ����Ҷ� �Ҽ����� ���� �ϰ� �� �μ���ȣ ���� ���
SELECT *FROM EMP;
SELECT DEPTNO AS �μ���ȣ , 
       ROUND(AVG(SAL)) AS ��ձ޿� ,  -- ROUND ���� TRUNC�ᵵ ��
       MAX(SAL) AS �ְ�޿�,
       MIN(SAL) AS �����޿�, 
       COUNT(*) AS �����
FROM EMP
GROUP BY  DEPTNO --�μ����� ���
ORDER BY DEPTNO;

--Q2 ���� ���� (JOB)�� �����ϴ� ����� 3�� �̻��� ���ް� �ο��� ���

SELECT JOB, COUNT (JOB) -- ���ް� ������ ��
FROM EMP
GROUP BY JOB;--JOB�� �׷�ȭ ��Ų��.
HAVING COUNT(*) >=3; --�׷�ȭ�� �����Ϳ� ���ǽ��� �ܴ�.

--Q3 ��������Ի� ������ �������� �μ����� ����� �Ի��ߴ��� ���
SELECT *FROM EMP;
SELECT TO_CHAR (HIREDATE,'YYYY')AS �Ի�⵵, --HIREDATE�� ���������� ������ش�
       DEPTNO AS �μ���ȣ,
       COUNT(*) AS �����
FROM EMP
GROUP BY TO_CHAR (HIREDATE,'YYYY'), DEPTNO --�Ի�⵵�� �׷�ȭ�����ش�
ORDER BY TO_CHAR (HIREDATE,'YYYY');--�Ի�⵵�� ������ �����ش� 

--Q4 �߰� ����(COMM)�� �޴� ������� ���� �ʴ� ����� ���
--COMM�� ������ 0 ,���������� X���( NVL2)
SELECT NVL2(COMM, 'O','X') AS ���翩��,
       COUNT (*) AS �����
FROM EMP
GROUP BY NVL2(COMM, 'O','X');--NULL���� �ƴѰ�� ,NULL���� ���-> ������ �޴°�� O ,������ �����ʴ� NULL�̸� X �� ���´�.
--Q5�� �μ��� �Ի� ������ �����, �ְ�޿�, �޿���
--��ձ޿��� ����ϰ� �� �μ��� �Ұ�� �Ѱ踦 ����ϼ���(ROLLUP)
SELECT DEPTNO AS �μ���ȣ,
       TO_CHAR(HIREDATE, 'YYYY') AS �Ի�⵵, --�Ի�⵵�� ���������� �ٲ��ش�
       COUNT(*) AS �����,
       MAX(SAL) AS �ְ�޿�,
       SUM(SAL) AS �޿��հ�,
       ROUND(AVG(SAL)) AS �޿���� -- �Ҽ��� �����ش�
FROM EMP 
GROUP BY ROLLUP(DEPTNO, TO_CHAR(HIREDATE,'YYYY')); -- �μ���ȣ�� �⵵ �׷�ȭ�� ��Ų��.

--CONSTRAINT(��������)
--: ���̺��� Ư�� �÷��� ����, �������ǿ� �������� ���� �����ʹ� ���� �Ұ�

/*
���Ἲ �������� : ������ ���Ἲ�� �����ͺ��̽��� ����� �������� �ϰ����� ��Ȯ���� ��Ű�� ���� ���Ѵ�.
                �ϰ����� ��Ȯ���� �Ҿ� ���� �����ͺ��̽��� �����μ��� ��ġ�� �ɰ��ѹ����� �ִ�.*/
1)���� ���Ἲ(Domain integrity)
    -������ ����, �����̼� ���� Ʃ�õ��� �� �Ӽ��� �����ο� ������ ���� ������ �Ѵ�.
2) ��ü ���Ἲ(Entity integrity)
    -�⺻Ű(PK) ����, �����̼ǿ� �⺻Ű�� �����ϰ�, �׿� ���� ���Ἲ ��Ģ
     �⺻Ű�� NULL�� �������� �ȵǰ�, �����̼� ���� ���� �ϳ��� ���� ����
3) ���� ���Ἲ(Referential integrity)
    -�ܷ�Ű(FK) ����, �����̼� ���� ���� ���踦 �����ϴ� ��������
    -�Ϲ������� �����Ǵ� �����̼��� �θ� �����̼�
     �����ϴ� �����̼��� ���� �����̼��̶�� �Ѵ�.
/*
--1. PRIMARY KEY(�⺻Ű)
    : �ϳ��� ���̺��� ���ڵ带 ���� ���� �� �ִ� Ư�� �÷��� ���ϰ�
    :NOT NULL + UNIQUE
    �ֹι�ȣ(SSN),�л���ȣ(STU_CODE), �ڵ�����ȣ(PHONE), NAVER ID
    
  2. NOT NULL
    : �ϳ��� ���̺��� Ư�� �÷��� ���� �ݵ�� �Է��ؾ� �ϴ� ����
    :NULL���� ������� �ʴ´�.
    
  3. UNIQUE
    : �ϳ��� ���̺��� Ư�� �÷��� ���� �ߺ��Ǵ� ���� �����ϴ� ����
    : ��, NULL�� ������ ���
    
  4. DEFAULT 
    : �ʱⰪ, �÷��� �ԷµǴ� �����Ͱ� ������ �̸� ��ӵ� ������
      �ڵ� �Է��ϴ� ����

  5. CHECK
    :Ư�� ������ �����͸� �Է� �����ϵ��� �ϴ� ����
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
    -- JS_CODE�� �⺻Ű (PK)����
    ALTER TABLE JS_MEMBERS
    ADD CONSTRAINT JS_CD_PK
    PRIMARY KEY(JS_CODE);
/*
    ALTER TABLE [TAB _NAME]
    ADD CONSTRAINT [CONST_NAME]
    PRIMARY KEY[COL_NAME];
*/
--�������� ��ȸ
SELECT*FROM USER_CONSTAINT;
--OWNER :�������� ���� ����
--CONSTRAINT_NAME :�������� �̸�(�ڵ� �����Ǳ⵵ ��)
--CONSTAINT_TYPEl
    C : CHECK, NOT NULL
    U : UNIQUE
    P : PRIMARY KEY
    R : FOREIN KEY
TABLE NAME: ���������� ������ ���̺�
INSERT INTO JS_MEMBERS
VALUES('JS001', '������', '1111','01026983756');

INSERT INTO JS_MEMBERS
VALUES('JS001', '������', '1234','0101234567');
--PK�� UNIQUE ���� ����� ���ԺҰ�

INSERT INTO JS_MEMBER(JS_NAME, JS_PASSWORD, JS_PHONE)
VALUES ('������', '0000','01011111111');
--PK������ NOT NULL ���� ����� ���� �Ұ�
--PK �������(2)
DROP TABLE JS_MEMBERS;

CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5) PRIMARY KEY,
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11)
        
    );
--PK �������(3)    
DROP TABLE JS_MEMBERS;
    CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4),
        JS_PHONE NVARCHAR2(11),
        CONSTRAINT JS_CD_PK PRIMARY KEY(JS_CODE)
    );
    SELECT * FROM USER_CONSTRAINTS;
--�������� �̸� ���ϱ�
--(TABLE_NAME) ����_(COLUMEN_NAME)����_CONSTRAINT_TYPE
--JS_CD_PK : JS_MEMEBERS ���̺��� JS_CODE �÷��� PK ��.

--�������� �����ϱ�
ALTER TABLE JS_MEMBERS
MODIFY CONSTIRAINT JS_CD_PK
PRIMARY KEY(JS_NAME);
ALTER TABLE RENAME JS_MEMBERS TO JSCODE
 rename column A to B

--�������� �����ϱ�
ALTER TABLE JS_MEMBERS
DROP CONSTRAINT JS_CD_PK;


--(2) NOT NULL;

--NOT NULL���� ���(1)
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
--NOT NULL �������(2)
DROP TABLE JS_MEMBERS;
CREATE TABLE JS_MEMBERS(
        JS_CODE         NVARCHAR2(5),
        JS_NAME         NVARCHAR2(5),
        JS_PASSWORD     NUMBER(4)NOT NULL,
        JS_PHONE NVARCHAR2(11)
        );
        
INSERT INTO JS_MEMBERS
VALUES('JS001', '������',1111,'0101234567');

INSERT INTO JS_MEMBERS(JS_CODE,JS_NAME,JS_PHONE)
VALUES('JS001', '������','0102345678');

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
VALUES('JS001','������',1234,'4100');

INSERT INTO JS_MEMBERS
VALUES('JS002','������',1111,'4100');
--UNIQUE(�ߺ�)���� ���� �������� ����

--(4) DEFAULT �������
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
--(5) CHECK ��������
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
VALUES(12);--PASSWORD �� 3�ڸ� �̻��� CHECK �������� ���� 
SELECT *FROM JS_MEMBERS; 

--�������� ��������
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
--JSMEMBERS ���̺� ����
CREATE TABLE JMEMBERS(
    J_ID NVARCHAR2(20),
    J_NAME NVARCHAR2(5),
    J_BIRTH DATE
);
--�������� �߰�(PK,�⺻Ű)
ALTER TABLE JMEMBERS
ADD CONSTRAINT J_ID_PK PRIMARY KEY(J_ID);
--������ ����1
INSERT INTO JMEMBERS
VALUES ('J001','������','1995/11/28');

INSERT INTO JMEMBERS
VALUES ('J001','������','1994/10/11'); --ORA-00001 : �ߺ� �ԷºҰ�

INSERT INTO JMEMBERS
VALUES ('J002','������','1994/10/11'); 

--�����  ���̺� ����
DROP TABLE ADDLISTS;
CREATE TABLE ADDLISTS(
    A_JID NVARCHAR2(20),
    A_ADDR NVARCHAR2(100)
);
--�������� �߰�(FK, �ַ�Ű)
ALTER TABLE ADDLISTS
ADD CONSTRAINT A_JID_FK FOREIGN KEY (A_JID)
REFERENCES JMEMBERS(J_ID); --J_ID�� A_ID�� ������Ÿ�԰� ũ�Ⱑ ���ƾ� �Ѵ�.

INSERT INTO ADDLISTS
VALUES ('J001', '��õ');

INSERT INTO ADDLISTS
VALUES ('J001', '��õ');

INSERT INTO ADDLISTS
VALUES ('J001', '����');

SELECT * FROM ADDLISTS;

INSERT INTO ADDLISTS
VALUES ('J002', '����');

INSERT INTO ADDLISTS
VALUES ('J003', '�λ�');
--���� ���� -
--ORA-02291: integrity constraint (SHINHEETAE.A_JID_FK) violated - parent key not found

DROP TABLE JMEMBERS ;
/*
�ֹ��ý��� ����
ENTITY:
1.SELLER (�Ǹ���)
-����� ��� ��ȣ(A_NUM), ��ȣ(A_BANNER), ��ǥ��(A_NAME)

2.GOODS(��ǰ)
-��ǰ�̸�(G_NAME), ����(G_PRICE),���(G_STOCK) 

3.BUYER(������)
-���̵�(B_ID), ��й�ȣ(B_PASSWORD), �̸�(B_NAME), ����ó(B_PHONE)

--���� �˸��� �������� ���� �ϱ�
-������ ���̺� ���� ������ �����ϱ�

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
VALUES('001','APPLE','4��');
CREATE TABLE GOODS (
         G_NAME NVARCHAR2(10),
         G_PRICE NUMBER(10),
         G_STOCK NUMBER(20)
         
);
ALTER TABLE GOODS
ADD CONSTRAINT G_NAME_PK PRIMARY KEY(G_NAME);
INSERT INTO GOODS
VALUES('������7',100,10);

INSERT INTO GOODS
VALUES('������20+',500,5);

INSERT INTO GOODS
VALUES('������30+',1000,1);

CREATE TABLE BUYER (
         B_ID NVARCHAR2(10),
         B_PASSWORD NUMBER(10),
         B_NAME NVARCHAR2(10),
         B_PHONE NUMBER(20)
);
ALTER TABLE BUYER
ADD CONSTRAINT B_ID_PK PRIMARY KEY(B_ID);
INSERT INTO BUYER
VALUES('HON123',1234,'��ȣ��',01023456789);

INSERT INTO BUYER
VALUES('SOOL',1111,'������',01011111111);

INSERT INTO BUYER
VALUES('SOO',2222,'������',01022222222);

INSERT INTO BUYER
VALUES('SANG',3333,'������',01033333333);
SELECT *FROM SELLER;
SELECT *FROM BUYER;
SELECT *FROM GOODS;
---
DROP TABLE SELLER;
DROP TABLE BUYER;
DROP TABLE GOODS;
----
