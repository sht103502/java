
/*
6.4�� �н��� ���� ����
(1) UPPER, LOWER, INITCAP : ��ҹ��� ����
(2) LENGTH, LENGTHB : ���ڿ��� ���̿� ũ��
(3) SUBSTR : ���ڿ� �Ϻ� ����
(4) INSTR : ���ڿ� ��ġ ã��
(5) REPLACE : �ٸ����ڷ� �ٲٱ�
(6) CONCAT : ���÷� �����͸� ��ġ��
(7) LPAD, RPAD : ����� ä���
*/
 
/*
1. EMP���̺��� �����ѹ� 7839�� ���������� ������� ȣ���Ѵ�.
ȣ��� �μ��ѹ��� ���ѵ� �̸��� �η��. ��Ī�� 'ȣ��'�� ����Ѵ�.
(EX. 00�� �μ��� XXXX��! ����Ƿ� ���ּ���!)
����1. �����͸� ��ĥ��� ������ CONCAT���� ����Ѵ�.
����2. �̸��� �θ� �� ù���ڴ� �빮�ڷ�, �������� �ҹ��ڷ� ��ȯ�Ѵ�.
����3. �μ���ȣ�� ���� ������� �����Ͽ� ȣ���Ѵ�.
*/
SELECT (DEPTNO || '���� �μ��� ' || INITCAP(ENAME) || '��! ����Ƿ� ���ּ���')
AS "ȣ��" FROM EMP WHERE MGR = 7839 ORDER BY DEPTNO ASC;

/*
1. JSSTU���̺��� ������ ������� ȣ���Ѵ�.
ȣ��� ���� ���ѵ� �̸��� �η��. ��Ī�� '����� ȣ��'�� ����Ѵ�.
(EX. 00���� XXXX��! ����Ƿ� ���ּ���!)
����1. �����͸� ��ĥ��� (1)CONCAT (2) || ���
����2. ��������� ���� ������� �����Ͽ� ȣ���Ѵ�
 �ڽ��� ���� �����ߴٴ� �����Ͽ�
*/
SELECT * FROM TAB;
SELECT GROUPNO || '���� ' || STUNAME || '��! ����Ƿ� ���ּ���!' AS "����� ȣ��" 
FROM JSSTU WHERE GROUPNO = 5 ORDER BY STUBIRTH ASC;

-- (1) ����
-- A���� : 4���� ��� (4��)
SELECT * FROM JSSTU WHERE GROUPNO=4;
-- B���� : ���� '��'���� ��� (5��)
SELECT * FROM JSSTU WHERE STUNAME LIKE '��%';

-- INTERSECT(������) : ������� ���� �����͸� ���
SELECT * FROM JSSTU WHERE GROUPNO=4 
INTERSECT
SELECT * FROM JSSTU WHERE STUNAME LIKE '��%';
 
-- UNION(������) : ��� ��� ������ ���
SELECT * FROM JSSTU WHERE GROUPNO=4 
UNION
SELECT * FROM JSSTU WHERE STUNAME LIKE '��%';
 
-- MINUS(������) : ���� �ۼ��� SELECT������ ���߿� �ۼ���
-- SELECT���� �����͸� ���� ���
SELECT * FROM JSSTU WHERE GROUPNO=4 
MINUS
SELECT * FROM JSSTU WHERE STUNAME LIKE '��%';

-- (2) �������� : TRIM( ), LTRIM( ), RTRIM( )
SELECT TRIM('   ICIA������   ') AS TRIM,
       LTRIM('  ICIA������   ') AS LTRIM,
       RTRIM('  ICIA������   ') AS RTRIM
FROM DUAL;

-- (3) ���� : ABS( )
SELECT 
    ABS(5) AS "����5", 
    ABS(-10) AS "����-10"
FROM DUAL;
 
-- (4) �ݿø� : ROUND( )
-- �ݿø��� �ڹٿ��� �����ϰ� ���밡��

SELECT ROUND(1234.5678) AS ROUND, -- �����κб����� ��Ÿ��(�Ҽ��� ù°�ڸ����� �ݿø�)
       ROUND(1234.5678, 0) AS ROUND_0, -- �����κб����� ��Ÿ��(�Ҽ��� ù°�ڸ����� �ݿø�) 
       ROUND(1234.5678, 1) AS ROUND_1, -- �Ҽ��� ù°�ڸ������� ��Ÿ��(�Ҽ��� ��°�ڸ����� �ݿø�)
       ROUND(1234.5678, 2) AS ROUND_2, -- �Ҽ��� ��°�ڸ������� ��Ÿ��(�Ҽ��� ��°�ڸ����� �ݿø�)
       ROUND(1234.5678, -1) AS ROUND_MINUS1, -- (���� ù��°�ڸ����� �ݿø�)
       ROUND(1234.5678, -2) AS ROUND_MINUS2  -- (���� �ѹ�°�ڸ����� �ݿø�)
FROM DUAL;
 -- �� ��ȭ��ȣ �ݿø� Ȯ���غ��� 4123.5789
--0, 1, 2, 3, -1, -2, -3
SELECT ROUND(4123.5789, 0) AS ROUND_0,
       ROUND(4123.5789, 1) AS ROUND_1,
       ROUND(4123.5789, 2) AS ROUND_2,
       ROUND(4123.5789, 3) AS ROUND_3,
       ROUND(4123.5789, -1) AS ROUND_MINUS1,
       ROUND(4123.5789, -2) AS ROUND_MINUS2,
       ROUND(4123.5789, -3) AS ROUND_MINUS3
FROM DUAL;
-- (5) ���� : TRUNC
SELECT TRUNC(1234.5678) AS TRUNC,
       TRUNC(1234.5678, 0) AS TRUNC_0,
       TRUNC(1234.5678, 1) AS TRUNC_1,
       TRUNC(1234.5678, 2) AS TRUNC_2,
       TRUNC(1234.5678, -1) AS TRUNC_MINUS1,
       TRUNC(1234.5678, -2) AS TRUNC_MINUS2
FROM DUAL; 
-- (6) ����� ���� ã�� : CEIL(���κ��� ū), FLOOR(���κ��� ����)
SELECT CEIL(3.14),
       FLOOR(3.14),
       CEIL(-3.14),
       FLOOR(-3.14)
FROM DUAL;
-- (7) ������ �� ���ϱ� : MOD(NUM1, NUM2)
-- NUM1 % NUM2
SELECT
    FLOOR(15/6) AS "15/6",
    MOD(15,6) AS"15%6"
FROM DUAL;
-- 1���� ���ַ� �Ǿ��ִ��� ���غ��ÿ�.
SELECT FLOOR(365/7) AS "1���� ����?"
FROM DUAL;
-- (8) ��¥ ���� �Լ�
-- DATE DATA + ���� : ���ڸ�ŭ ���� ��¥
-- DATE DATA - ���� : ���ڸ�ŭ ���� ��¥
-- DATE DATA1 - DATE DATA2 : �� ��¥�� �ϼ� ����
-- DATE DATA1 + DATE DATA2 : ���� �Ұ���
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD';
SELECT 
SYSDATE AS "NOW(����)",
SYSDATE+1 AS "TOMORROW(����)",
SYSDATE-1 AS "YESTERDAY(����)"
FROM DUAL;
-- ����, ��������, �������� ���ϱ�
SELECT
SYSDATE AS "NOW(����)",
SYSDATE-7 AS "LASTWEEK(������)",
SYSDATE+7 AS "NEXTWEEK(������)"
FROM DUAL; 
-- (9) ���� �� ���ϱ� : MONTHS_BETWEEN( )
-- ū ��¥, ���� ��¥ ������
SELECT CEIL(MONTHS_BETWEEN('2020/10/23','2020/05/01')) AS "���� ��"
FROM DUAL;
-- (10) ���� �� ���ϱ� : ADD_MONTHS( )
SELECT ADD_MONTHS(SYSDATE, 5)
FROM DUAL;
-- (11) �ٰ��� ���Ͽ� �ش��ϴ� ��¥ : NEXT_DAY( )
SELECT NEXT_DAY(SYSDATE, '������') AS "���ƿ��� ������"
FROM DUAL;
SELECT NEXT_DAY(SYSDATE, '�Ͽ���') AS "���ƿ��� �Ͽ���"
FROM DUAL;
 
-- (12) �̹���/ Ư������ ������ �ϼ� : LAST_DAY( )
SELECT LAST_DAY(SYSDATE) FROM DUAL;
 
-- 2020�� 2�� ���������� ���!
-- SYSDATE�� '2020/06/05'�� ���� ���
SELECT LAST_DAY('2020/02/01') AS "2020�� 2�� ��������" FROM DUAL;

-- (13)
--      1) TO_CHAR : ���� �Ǵ� ��¥�� ���ڵ����ͷ� ��ȯ
--          ex) String.valueOf(100)
--      2) TO_NUMBER : ���ڸ� ���ڷ�
--          ex) Integer.parseInt("100")
--      3) TO_DATE : ���ڸ� ���ڷ� 
SELECT TO_CHAR(SYSDATE, 'MM-DD DAY') FROM DUAL;
-- DATE FORMAT(��¥����)
-- TO_CHAR(SYSDATE, 'YYYYMMDD') : 20200605
SELECT TO_CHAR(SYSDATE, 'YYYYMMDD') AS "YYYYMMDD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY-MM-DD') : 2020-06-05
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS "YYYY-MM-DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY/MM/DD') : 2020/06/05
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') AS "YYYY/MM/DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YYYY') : 2020
SELECT TO_CHAR(SYSDATE, 'YYYY') AS "YYYY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'YY') : 20 (��)
SELECT TO_CHAR(SYSDATE, 'YY') AS "YY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'MM') : 06
SELECT TO_CHAR(SYSDATE, 'MM') AS "MM" FROM DUAL;
-- TO_CHAR(SYSDATE, 'MON') : 6�� 
SELECT TO_CHAR(SYSDATE, 'MON') AS "MON" FROM DUAL;
-- TO_CHAR(SYSDATE, 'D') : 6   -- ������ ���� �ϼ�(�Ͽ���=1)
SELECT TO_CHAR(SYSDATE, 'D') AS "D" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DD') : 05
SELECT TO_CHAR(SYSDATE, 'DD') AS "DD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DDD') : 157  -- 1�� ���� �ϼ�
SELECT TO_CHAR(SYSDATE, 'DDD') AS "DDD" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DAY') : �ݿ���
SELECT TO_CHAR(SYSDATE, 'DAY') AS "DAY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DY') : ��
SELECT TO_CHAR(SYSDATE, 'DY') AS "DY" FROM DUAL;
-- TO_CHAR(SYSDATE, 'WW') : 23  -- 1�� ���� ����
SELECT TO_CHAR(SYSDATE, 'WW') AS "WW" FROM DUAL;
-- TO_CHAR(SYSDATE, 'W') : 1  -- �Ѵ� ���� ����
SELECT TO_CHAR(SYSDATE, 'W') AS "W" FROM DUAL;
-- TO_CHAR(SYSDATE, 'DL') : 2020�� 6�� 5�� �ݿ���  -- �ش����� ��¥����
SELECT TO_CHAR(SYSDATE, 'DL') AS "DL" FROM DUAL;

-- �ð�����
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD HH24:MI:SS';

-- TO_CHAR(SYSDATE, 'AM') -- ����
-- TO_CHAR(SYSDATE, 'PM') -- ����
-- TO_CHAR(SYSDATE, 'HH') -- 11(��) // ����1�� : 01��
-- TO_CHAR(SYSDATE, 'HH24') -- 11(��) // ����1�� : 13��
-- TO_CHAR(SYSDATE, 'MI') -- 37(��)
-- TO_CHAR(SYSDATE, 'SS') -- 54(��)
SELECT SYSDATE AS "����ð�", -- ����
 TO_CHAR(SYSDATE, 'HH')AS "12�ð�����",
 TO_CHAR(SYSDATE, 'HH24')AS "24�ð�����",
 TO_CHAR(SYSDATE, 'MI')AS "��",
 TO_CHAR(SYSDATE, 'SS')AS "��"
 FROM DUAL;
-- ���� 11:42:14 ���(SYSDATE)
--SELECT TO_CHAR(SYSDATE, 'AM HH24:MI:SS') FROM DUAL;

-- ����
-- TO_CHAR(SYSDATE, 'CC') -- 21����
-- TO_CHAR(SYSDATE, 'BC') -- ����
SELECT TO_CHAR(SYSDATE, 'CC') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'BC YYYY') FROM DUAL;
-- (15) NULL ó�� �Լ� : NVL, NVL2
--      NVL([COL_NAME], 0) : �÷��� �����Ͱ� NULL�� ��� 0���� �ٲ۴�.
--      NVL2([COL_NAME], 'NULL���� �ƴҰ��', 'NULL�� ���')
-- AB���̺� ����
CREATE TABLE AB(
    ABNAME NVARCHAR2(10),
    ABAGE NUMBER(5),
    ABMERRY NVARCHAR2(5)
);
 -- ������ ����
INSERT INTO AB(ABNAME)
VALUES ('HWANG');
 INSERT INTO AB
VALUES ('YANG', 35, 'X');
-- AB���̺� ��ȸ
SELECT * FROM AB;
SELECT ABNAME, NVL(ABAGE, 999) AS "����NULL����", ABMERRY FROM AB;
 SELECT ABNAME,
       NVL2(ABAGE, 111, 222) AS "����NULL",
       NVL2(ABMERRY, 'NULL�� �ƴ� �� ȣ��', 'NULL�϶� ȣ��')
FROM AB;
-- NVL ��½ÿ��� �������� ���� ���̺��� ���� ����ִ�.
 -- (16) SWITCH�� : DECODE
SELECT ENAME, 
       DECODE(DEPTNO, 10, '�λ���',
                      20, '������',
                      30, 'ȫ����'
                )
FROM EMP;
SELECT ENAME, DEPTNO,
    CASE
        WHEN DEPTNO = 10 THEN '�λ���'
        WHEN DEPTNO = 20 THEN '������'
        WHEN DEPTNO = 30 THEN 'ȫ����'
    END AS ���μ�
FROM  EMP
ORDER BY DEPTNO;

--(18) �׷�ȭ �Լ� 
--SUM( ) : ������ �÷� �������� ��
--AVG( ) : ������ �÷� �������� ���
--COUNT( ) : ������ �÷� �������� ����
--MAX ( ) : ������ �÷��� �������� �ִ�
--MIN ( ) : ������ �÷��� �������� �ּڰ�

SELECT SUM(SAL) AS �޿��հ�, SUM(DISTINCT(SAL)) AS "��� �����?",
        SUM(ALL(SAL)) AS "�׷� ���?"
 FROM EMP;
 
 --�μ��� 20���� ����� �޿��� �հ�� ��ձ޿��� ��ȸ�ϰ�,
 --���� ���� �޿��� �޴� ����� �������� �޿��� �޴� ����� ��ȸ�Ͻÿ�.
 --(SELECT 1�� ���)
--�������� ���
 SELECT ENAME,SAL
 FROM EMP
 WHERE SAL = (SELECT MAX(SAL)
                FROM EMP);

SELECT ENAME,SAL
 FROM EMP
 WHERE SAL = (SELECT MIN(SAL)
                FROM EMP);
 
 
 