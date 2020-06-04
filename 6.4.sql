/*

Date : 2020.06.04

Author : ������

Description : ����Ŭ �Լ�
Version : 1.0

*/



/*
    (1) ��, �ҹ��ڸ� �ٲ��ִ� �Լ�
        - UPPER : ��� �빮�ڷ�
        - LOWER : ��� �ҹ��ڷ�
        - INITCAP : ù���� �빮��, �������� �ҹ���
*/    

SELECT UPPER ('AbCdEfG') AS "UPPER(�빮��)"
FROM DUAL;
 

SELECT LOWER('AbCdEfG') AS "LOWER(�ҹ���)"
FROM DUAL;
 
SELECT INITCAP ('AbCdEfG') AS "INITCAP(ù���� �빮��)"
FROM DUAL;

 

/*
    (2) ���ڿ� ���̸� ���ϴ� LENGTH
*/    

SELECT LENGTH('AbCdEfG') AS ���ڿ�����
FROM DUAL;

 
SELECT LENGTH('$_$') AS Ư�����ڿ�����
FROM DUAL;

 

-- EMP ���̺��� �̸��� 5�� �̻��� ���� ��ȸ
SELECT ENAME, LENGTH(ENAME)
FROM EMP WHERE LENGTH(ENAME) >= 5;
 
-- LENGTHB : ������ ũ�� ��ȸ(byte)
SELECT LENGTHB('��') AS �ѱ�, LENGTHB('a') AS �ҹ���, LENGTHB('A') AS �빮��
FROM DUAL;
 
-- !, #, _, ,
SELECT LENGTHB('!') AS "!", LENGTHB('#') AS "#",
LENGTHB('_') AS "_", LENGTHB(' ') AS " " FROM DUAL;

 

/*
    (3) ���ڿ� �Ϻθ� �����ϴ� SUBSTR  
    SUBSTR('���ڿ�������' OR [COL_NAME], ������ġ, �������)
    SUBSTR('���ڿ�������' OR [COL_NAME], ������ġ)

*/
SELECT JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5) FROM EMP;
SELECT 'HELLO!!', SUBSTR('HELLO!!', 1, 2), SUBSTR('HELLO!!', 3, 2), SUBSTR('HELLO!!', 5) FROM DUAL;

 

/*
    (4) ���ڿ� ������ �ȿ��� Ư�� ���� ��ġ�� ã�� INSTR  
    INSTR('���ڿ�������' OR [COL_NAME],
          '��ġ�� ã������ �κ� ����',
           ������ġ(�⺻��1),
           ���� ������ �� ���° ��������(�⺻��1))  

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
    (5) Ư�����ڸ� �ٸ� ���ڷ� �ٲٴ� REPLACE
    REPLACE ('���ڵ�����' OR [COL_NAME], ã�� ����, �ٲܹ���)
    REPLACE ('���ڵ�����' OR [COL_NAME], ã�� ����);
*/

-- WEB���� �޴���ȭ �Է��� �� �پ��� �Է� ���
SELECT 
'010-1234-2345' AS "REPLACE����",
REPLACE ('010-1234-2345', '-', ' ') AS "REPLACE�⺻��",
REPLACE ('010-1234-2345', '-') AS "REPLACE������"
FROM DUAL;

-- ������ ���� ù �����... ������, �����鼭 �� ��������
-- ������ => ����, ������ => �輺��

SELECT
    REPLACE ( 
        REPLACE ('������ ���� ù �����... ������, �����鼭 �� ��������', '������', '����'),
'������', '�輺��') AS "����������"
FROM DUAL;

 

/*
    (6) �� �÷� �����͸� ��ġ�� CONCAT
*/

SELECT CONCAT (EMPNO, ENAME),
        CONCAT (EMPNO, CONCAT(' : ', ENAME))

FROM EMP;

SELECT EMPNO || ENAME AS CONCAT1,
        EMPNO || ' : ' || ENAME AS CONCAT2

FROM EMP;
-- || �� CONCAT�� ������ �����ϴ� ���ڷ� ����
-- JOB�� SALESMAN�� ��� �̸� �տ�
-- '��������' ���� �ٿ��ֱ�

SELECT '�������� ' || ENAME AS ����̸�
FROM EMP
WHERE JOB = 'SALESMAN';

 

/*
    (7) �������� �� ������ Ư�� ���ڷ� ä���
        LPAD, RPAD
        
    LPAD('���ڿ�', �������ڸ���, ������� ä�﹮��(�⺻�� ' '))
    RPAD('���ڿ�', �������ڸ���, ������� ä�﹮��(�⺻�� ' '))

*/
 
SELECT 'ICIA',
        LPAD('ICIA', 7, '#') AS LPAD1,
        RPAD('ICIA', 7, '*') AS RPAD1,
        LPAD('ICIA', 7) AS LPAD2,
        RPAD('ICIA', 7) AS RPAD2
FROM DUAL;

-- 1) �ֹι�ȣ 980328-1******
SELECT RPAD('951128-1',14,'*') AS �ֹι�ȣ
FROM DUAL;
--�ٸ� ������� 
SELECT RPAD(SUBSTR('951128-1',1,8), 14, '*') AS �ֹι�ȣ
FROM DUAL;
------------------------
SELECT RPAD(SUBSTR(SSN,1,8), 14, '*') AS �ֹι�ȣ
FROM JJJSSS;

DROP TABLE JJJSSS;

CREATE TABLE JJJSSS(
    JSNAME NVARCHAR2(3),
    SSN NVARCHAR2(14),
    JSSPHONE NVARCHAR2(13)
);
--INSERT INTO JJJSSS VALUES ('������', '951128-1234567');
--INSERT INTO JJJSSS VALUES ('������', '951128-2234567');

INSERT INTO JJJSSS VALUES ('������', '951128-1234567','010-1234-5678');
INSERT INTO JJJSSS VALUES ('������', '951128-2234567','010-2345-6789');

SELECT *FROM JJJSSS;
------
-- 2) ��ȭ��ȣ 010-****-2837
SELECT RPAD( SUBSTR(JSPHONE,1,4), 8, '*'||SUBSTR(JSPHONE, 9)AS ��ȭ��ȣ)
FROM JJJSSS;
----------------���� ������ ����-------
--����1)
--���ڿ������� 2���� �ִ�. ��2���� ���ڿ������� �ȿ��� 1�� ã�� ���° ���� ����϶�.
--llllllll1,llllllll1llll1lllll 
SELECT 'llllllll1', 'llllllll1llll1lllll',
INSTR('llllllll1', '1', 1, 1) AS ����1����ġ,
INSTR('llllllll1llll1lllll', '1', 1, 2) AS ����1����ġ_1
FROM DUAL;

--2������ 
--���� ũ�⸦ ����� �� ���� ���ڿ��� ���غ���
-- LENGTHB : ������ ũ�� ��ȸ(byte)
--�Ƹ��ٿ��̰���(�ѱ�), WHATISYOURNAME(����), ?,?��?(�߱���)
SELECT LENGTHB('�Ƹ��ٿ��̰���') AS �ѱ�, LENGTHB('WHATISYOURNAME') AS ����, LENGTHB('?,?��?') AS �߱���
FROM DUAL;


