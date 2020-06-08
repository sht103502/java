--
--(1)���̺� ���� ���캸��
SELECT *FROM TABLE
--(2)ALIAS(��Ī)���� ��ȸ�ϱ�
 SELECT [COL_NAME] AS ��Ī 
 FROM TABLE;
--(3)�ߺ� �����͸� ���� DISTINCT
SELECT COL_NAME FROM TABLE;
--(4)�����ϱ�
--1)�������� ASC
SELECT DISTINCT COL_NAME FROM TABLE -- DISTINCT�� �ߺ�����
ORDER BY COL_NAME ASC;--�ø�����, �ø������� ORDER BY �Ƚᵵ �ȴ�.
--2)�������� DESC
SELECT DISTINCT COL_NAME FROM TABLE
ORDER BY COL_NAME DESC;--��������
--(5) ���ǰ˻�
SELECT COL_NAME
FROM TABLE
WHERE (���ǽ�)

--(6) �ΰ��� �̻� ���� �˻�
--1)AND
--2)OR
SELECT COL_NAME 
FROM TABLE
1)WHERE ���ǽ�1 AND ���ǽ�2 -> ��� ���� �� TRUE, �ϳ��� �����̸� FALSE
2)WHERE ���ǽ�1 OR ���ǽ�2 -> ��� ������ �� FALSE, �ϳ��� ���̸� TRUE
--(7) �������, ���ڿ���
SELECT *
FROM TABLE
WHERE COL_NAME ���ǽ�

SELECT *
FROM TABLE
WHERE COL_NAME ���ǽ�1(�������+ ���ڿ���) AND COL_NAME ���ǽ�2(�������+ ���ڿ���);���ǽ�1���� ���ǽ�2������ 
��) WHERE STUNAME >='��'AND STUNAME<='��';--�达���� �̾�������
--(8) IN ������
--���� �÷����� �������� ���ǰ˻�
SELECT*
FROM DUAL
1)WHERE COL_NAME IN (COL_NAME�� ���� ������);-> COL_NAME ���� ���ѵ����͸� �˻����ش�
2)WHERE COL_NAME NOT IN (COL_NAME�� ���� ������);-> COL_NAME ���� ������ ���� �����͸� �˻����ش�
--(9)BTWEEN A AND B
--A ���� B������ �����͸� �˻�
 SELECT *
    FROM [TABLE_NAME]
    WHERE [COL_NAME] BETWEEN �ּڰ� AND �ִ�;
--(10) LIKE, ���ϵ� ī��
SELECT *
FROM DUAL
WHERE [COL_NAME] LIKE(COL_NAME �� ���� ������);
--���ϵ� ī��
--_ : � ���̵� ������� �Ѱ��� ���� �����͸� �ǹ�
--%: ���̶� ������� (���� ���°�쵵 ����) ��� ���� �����͸� �ǹ�
--(11) IS NULL /IS NOT NULL
 IS NULL :������ִ�.
 IS NOT NULL : ��������ʴ�, ä�����ִ�.

--
6.4�� �н��� ���� ����
(1) UPPER, LOWER, INITCAP : ��ҹ��� ����

SELECT UPPER ('���ڵ�') AS "UPPER(�빮��)"-> ��� ���ڵ��� �빮�ڷ� ���
FROM DUAL;
SELECT LOWER ('���ڵ�') AS "LOWER(�ҹ���)"-> ��繮�ڵ��� �ҹ��ڷ� ���
FROM DUAL;
SELECT INITCAP ('���ڵ�') AS "INITCAP(ù���� �빮��)"-> ù���ڸ� �빮�ڷ� ���
FROM DUAL;
(2) LENGTH, LENGTHB : ���ڿ��� ���̿� ũ��
SELECT LENGTH('AbC/dE_Fg') AS ���ڿ�����
FROM DUAL;

SELECT LENGTHB('��') AS �ѱ�, LENGTHB('a') AS �ҹ���,
LENGTHB('A') AS �빮�� FROM DUAL;


(3) SUBSTR : ���ڿ� �Ϻ� ����
SELECT ('���ڿ�������' OR [COL_NAME],������ġ,�������)
        ('���ڿ�������' OR [COL_NAME],������ġ)
FROM DUAL;
(4) INSTR : ���ڿ� ��ġ ã��
SELECT INSTR('���ڿ�������' OR [COL_NAME], 
    '��ġ�� ã������ �κ� ����'.
������ġ(�⺻�� 1), ���� ������ �� ���° ��������(�⺻�� 1))
FROM DUAL;
(5) REPLACE : �ٸ����ڷ� �ٲٱ�
SELECT
REPLACE('���ڵ�����' OR[COL_NAME],ã�� ����,�ٲ� ����)
REPLACE('���ڵ�����' OR[COL_NAME],ã�� ����);
FROM DUAL;
(6) CONCAT : ���÷� �����͸� ��ġ��
SELECT CONCAT(COL_NAME,COL_NAME),
       CONCAT(COL_NAME,CONCAT(':',COL_NAME))
FROM DUAL;
SELECT COL_NAME || COL_NAME AS ��Ī1, COL_NAME || ':' || COL_NAME AS ��Ī2
FROM DUAL;

(7) LPAD, RPAD : ����� ä���
LPAD('���ڿ�',�������ڸ���,������� ä�﹮��(�⺻��''))
RPAD('���ڿ�',�������ڸ���,������� ä�﹮��(�⺻��''))

--<6/5>--
-- (1) ���� 
������ INTERSECT: ������� ���� �����͸� ���
������ UNION : ��� ��� ������ ���
������ MINUS : ���� �ۼ��� SELECT������ ���߿� �ۼ��� SELECT���� �����͸� ���� ���
-- (2) �������� : TRIM( ), LTRIM( ), RTRIM( )
SELECT TRIM('   ���� ') AS TRIM,��������
       LTRIM('  ����   ') AS LTRIM, ���� ��������
       RTRIM('  ����    ') AS RTRIM ������ ��������
FROM DUAL;
-- (3) ���� : ABS( )
SELECT 
    ABS(5) AS "����5", 
    ABS(-10) AS "����-10"
FROM DUAL;
-- (4) �ݿø� : ROUND( )
SELECT ROUND(1234.5678, 0) AS ROUND_0, --1235 �����κб����� ��Ÿ��(�Ҽ��� ù°�ڸ����� �ݿø�) 
       ROUND(1234.5678, 1) AS ROUND_1, --1234.6 �Ҽ��� ù°�ڸ������� ��Ÿ��(�Ҽ��� ��°�ڸ����� �ݿø�)
       ROUND(1234.5678, 2) AS ROUND_MINUS2,--1200 (���� �ѹ�°�ڸ����� �ݿø�)
FROM DUAL;
-- (5) ���� : TRUNC
SELECT TRUNC(1234.5678) AS TRUNC,--1234 
       TRUNC(1234.5678, 0) AS TRUNC_0,--1234
       TRUNC(1234.5678, 1) AS TRUNC_1,--1234.5
       TRUNC(1234.5678, 2) AS TRUNC_2,--1234.56
       TRUNC(1234.5678, -1) AS TRUNC_MINUS1,--1230
       TRUNC(1234.5678, -2) AS TRUNC_MINUS2--1200
FROM DUAL; 
-- (6) ����� ���� ã�� : CEIL(���κ��� ū), FLOOR(���κ��� ����)
SELECT CEIL(3.14),--4   
       FLOOR(3.14),--3
       CEIL(-3.14),-- -3
       FLOOR(-3.14)-- -4
FROM DUAL;
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
