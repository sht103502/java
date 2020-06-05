CREATE USER DB1
IDENTIFIED BY "1111";

CREATE USER DB2
IDENTIFIED BY "1111";

CREATE USER DB3
IDENTIFIED BY "1111";

GRANT CONNECT TO DB1;
GRANT CONNECT TO DB2;
GRANT CONNECT TO DB3;

SELECT*FROM DBA_USERS;

CREATE TABLE EMP(
    EMP_NAME NVARCHAR2(5)
);

INSERT INTO EMP VALUES('������');
INSERT INTO EMP VALUES('�̼���');
INSERT INTO EMP VALUES('�赵��');

GRANT ALL ON EMP TO DB1;
GRANT ALL ON EMP TO DB2;
GRANT ALL ON EMP TO DB3;

COMMIT;

SELECT*FROM DBA_USERS;

ALTER USER DB1 ACCOUNT UNLOCK;
ALTER USER DB2 ACCOUNT UNLOCK;
ALTER USER DB3 ACCOUNT UNLOCK;

ALTER USER DB1 IDENTIFIED BY 9999;
ALTER USER DB2 IDENTIFIED BY 9999;
ALTER USER DB3 IDENTIFIED BY 9999;

DROP TABLE JSMEMBER;

CREATE TABLE JSMEMBER(
JSMEMBER_NAME    NVARCHAR2(5),
JSMEMBER_AGE     NUMBER(2),
JSMEMBER_PHONE     NVARCHAR2(13),
JSMEMBER_DATE     DATE,
JSMEMBER_ADR     NVARCHAR2(20),
JSMEMBER_EMAIL     NVARCHAR2(30),
JSMEMBER_HOBBY     NVARCHAR2(30)
);

SELECT*FROM JSMEMBER;

INSERT INTO JSMEMBER
VALUES('������',30,'01012345678','1991-01-21','��õ','dldbwls12321@naver.com','����');

INSERT INTO JSMEMBER(JSMEMBER_NAME,JSMEMBER_AGE,JSMEMBER_PHONE,JSMEMBER_DATE,JSMEMBER_ADR,JSMEMBER_EMAIL,JSMEMBER_HOBBY)
VALUES('������',26,'01012345678','1995-11-28','��õ','GMLXO@naver.com','���');

INSERT INTO JSMEMBER(JSMEMBER_NAME,JSMEMBER_AGE,JSMEMBER_PHONE,JSMEMBER_DATE,JSMEMBER_ADR,JSMEMBER_EMAIL,JSMEMBER_HOBBY)
VALUES('�̼���',28,'01012345678','1912-01-11','��õ','THGUS@naver.com','�ڱ�');

INSERT INTO JSMEMBER(JSMEMBER_NAME,JSMEMBER_AGE,JSMEMBER_PHONE,JSMEMBER_DATE,JSMEMBER_ADR,JSMEMBER_EMAIL,JSMEMBER_HOBBY)
VALUES('�赵��',26,'01078965432','1978-04-06','��õ','EHDUS@naver.com','���ǰ���');

GRANT ALL ON JSMEMBER TO DB1;
GRANT ALL ON JSMEMBER TO DB2;
GRANT ALL ON JSMEMBER TO DB3;

GRANT SELECT ON JSMEMBER TO DB1;
GRANT SELECT ON JSMEMBER TO DB2;
GRANT SELECT ON JSMEMBER TO DB3;

--���̺� ���� ��ü ����(ALL ON)
--GRANT ALL ON STUDENT TO "";

--���̺� �˻� ����
--GRANT SELECT ON "" TO "";
--------------------------------------------6.3------------------------------------------

--DROP TABLE[TABLE_NAME]
DROP TABLE JSMEMBER;

--CREATE
--CREATE TABLE [TABLE_NAME](
--      [COL1_NAME] [COL1 TYPE] )

CREATE TABLE JSMEMBER(          --�̸� ���� ��ȭ��ȣ
    JSNAME NVARCHAR2(5), 
    JSAGE  NUMBER(2),
    JSPHONE NVARCHAR2(13)
);

--ALTER
/*
    AKTER TABLE [TABLE_NAME]
    1)ADD : COLUMN �߰�
    2)RENAME : COLUMN �̸�����
    3)MODIFY : COLUMN Ÿ�Ժ���
    4)DROP : COLUMN ����
*/

--�����߰�
--JSNAME���� NAME_JS�÷��� ����
--AGEŸ���� NVARCHAR(3)���� ����
--JSPHONE�÷� ����

ALTER TABLE JSMEMBER
ADD JSBIRTH DATE;

ALTER TABLE JSMEMBER
RENAME COLUMN JSNAME TO NAME_JS;

ALTER TABLE JSMEMBER
MODIFY JSAGE NVARCHAR2(20);

ALTER TABLE JSMEMBER
DROP COLUMN JSPHONE;


--DML(Data Manipulation Language) ���۾�

--1.INSERT
/*
1) ��� COLUMN �����͸� ������ ��
-INSERT INTO [TABLE_NAME]
 VALUES(COL1 DATA,COL2 DATA, .... COL N DATA);
2) Ư�� COLUMN �����͸� ������ ��
-INSERT INTO [TABLE_NAME](COL2 NAME,COL3 NAME)
 VALUES(COL2 DATA, COL3 DATA);
*/

SELECT*FROM JSMEMBER;

INSERT INTO JSMEMBER
VALUES ('������','30','19910121');

--�̸��ϰ� ���ϸ� �Է�.
INSERT INTO JSMEMBER(NAME_JS,JSBIRTH)
VALUES ('������', SYSDATE);

ALTER SESSION
SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH24:MI:SS';

--2.UPDATE
/*
UPDATE[TABLE_NAME]
SET(COL1_NAME) = (COL1_DATA),(COL2_NAME) = (COL2_DATA)
WHERE [���浥���� ��������(CONDITION)];
*/

SELECT * FROM JSMEMBER;

UPDATE JSMEMBER
SET NAME_JS ='����',JSAGE=40
WHERE NAME_JS ='������';

-- 3.DELETE

/*
1)Ư�������͸� �����ϴ� ���
DELETE FROM[TABLE_NAME]
WHERE [CONDITION(����)];

2)��絥���͸� �����ϴ� ���
DELETE FROM [TABLE_NAME];
*/

DELETE FROM JSMEMBER
WHERE JSAGE = 30;

DELETE FROM JSMEMBER;

--4.SELECT
/*
1)Ư�� �÷��� ��ȸ
SELECT [COL_NAME]
FROM [TABLE_NAME]
WHERE [CONDITION(����)]

2)��� �÷��� ��ȸ
SELECT*
FROM [TABLE_NAME]
WHERE(CONDITION);
*/

--Ư��
SELECT NAME_JS
FROM JSMEMBER
WHERE JSAGE = 30;

--���
SELECT *
FROM JSMEMBER
WHERE JSAGE=30;

--���̺� ��ȸ,��� ������ ��ȸ
SELECT * FROM JSMEMBER;

--��Ī(ALIAS)�� �̿��ؼ� �˻��ϱ�
SELECT NAME_JS AS ������ ,JSAGE AS ����
FROM JSMEMBER
WHERE JSAGE =30;

--1.�÷��߰�
ALTER TABLE JAMEMBER
ADD JSHOBBY NVARCHAR2(20)

ALTER TABLE JAMEMBER
ADD JSPHONE NVARCHAR2(13)
--2.������ ������ �Է�
UPDATE JSMEMBER
SET NAME_JS ='����',JSAGE=
WHERE NAME_JS ='������';


-----------------------------------------------------6.4---------------------------------------------------------------

/* ����Ŭ �Լ�
1) ��,�ҹ��ڸ� �ٲ��ִ� �Լ�
   -UPPER : ��� �빮�ڷ� , LOWER :��� �ҹ��ڷ� , INITCAP : ù���� �빮��,������ �ҹ���
*/   
SELECT UPPER('AbCdEfG') AS "UPPER(�빮��)"
FROM DUAL;

SELECT LOWER('AbCdEfG') AS "LOWER(�ҹ���)"
FROM DUAL;

SELECT INITCAP('abCdEfG') AS "INITCAP(ù���ڴ빮��)"
FROM DUAL;

/* 2.���ڿ� ���̸� ���ϴ� LENGTH */
SELECT LENGTH('AbC/dE_fG')AS ���ڿ� ����
FROM DUAL;
.
--EMP ���̺��� �̸��� 5�� �̻��� ������ȸ
SELECT ENAME, LENGTH(ENAME)
FROM EMP WHERE LENGTH(ENAME)>=5;

--LENGTHB : ������ ũ�� ��ȸ(BYTE)
SELECT LENGTHB('��') AS �ѱ� ,LENGTHB('a') AS �ҹ��� , LENGTHB('A') AS �빮��  FROM DUAL;
-- !,#,_,(����_
SELECT LENGTHB('!') AS "!" ,LENGTHB('#') AS "#" , LENGTHB('_') AS "_" , LENGTHB('_') AS " " FROM DUAL;

/* 3.���ڿ� �Ϻθ� �����ϴ� SUBSTR
    SUBSTR('���ڿ�������' OR [COL_NAME],������ġ,�������)
    SUBSTR('���ڿ�������' OR [COL_NAME],������ġ)
*/
-- (1,2)�� 1�� ���۰� 2�� � �׷��� H E  (3,2)  LL
SELECT 'HELLO!!',SUBSTR('HELLO!!',1,2),SUBSTR('HELLO!!',3,2),SUBSTR('HELLO!!',5) FROM DUAL;

/*4.���ڿ� ������ �ȿ��� Ư�� ���� ��ġ�� ã�� INSTR
    INSTR('���ڿ�������' OR [COL_NAME], 
    '��ġ�� ã������ �κ� ����'.
    ������ġ(�⺻�� 1),
    ���� ������ �� ���° ��������(�⺻�� 1))
*/
SELECT INSTR('HELLO, ORACLE!','L') AS INSTR1,
       INSTR('HELLO, ORACLE!','L',5) AS INSTR2,
       INSTR('HELLO, ORACLE!','L',2,3) AS INSTR3 --L�� 2��°���� 3��°�� �ִ� L�� �ִ� ����.
FROM DUAL;
--O�� ��ġ ã��
SELECT INSTR('HELLO, ORACLE!','O',1,1) AS INSTR1,
       INSTR('HELLO, ORACLE!','O',1,2) AS INSTR2
FROM DUAL;

--5.Ư�����ڸ� �ٸ� ���ڷ� �ٲٴ� REPLAGE
--  REPLACE('���ڵ�����' OR[COL_NAME],ã�� ����,�ٲ� ����)
--  REPLACE('���ڵ�����' OR[COL_NAME],ã�� ����);

SELECT 
    --'010-7342-3288' AS "REPLACE ����",
   UPPER (REPLACE ( REPLACE('abc-1111-2222','abc','010'),'2222','abcd')) AS "�����ϼ���"
   -- REPLACE ('abc-7342-3288','-') AS "REPLACE������"
FROM DUAL;

--1������ abc-1111-efgh �� def-1111-abcd�� �����ϰ� ���ĺ��� �빮�ڷ� �����ϼ���. 

--������ ���� ù �ű��...������,�����鼭 �� ��������
--������ =>����, ������=>�輺��

SELECT 
REPLACE( 
REPLACE('������ ���� ù �ű��... ������, �����鼭 �� ��������','������','����'),'������','�輺��')AS "REPLACE������"
FROM DUAL;

--6.�� �÷� �����͸� ��ġ�� CONCAT
SELECT CONCAT(EMPNO,ENAME),
       CONCAT(EMPNO,CONCAT(':',ENAME))
FROM EMP;

SELECT EMPNO || ENAME AS CONCAT1, EMPNO || ':' || ENAME AS CONCAT2
FROM EMP;

--JOB�� SALESMAN �� ��� �̸� �տ� '��������' ���� �ٿ��ֱ�
SELECT '��������'|| ENAME AS ����̸�
FROM EMP
WHERE JOB ='SALESMAN';

--7.�������� �� ������ Ư�� ���ڷ� ä��� LPAD,RPAD
--LPAD('���ڿ�',�������ڸ���,������� ä�﹮��(�⺻��''))
--RPAD('���ڿ�',�������ڸ���,������� ä�﹮��(�⺻��''))

SELECT 'ICIA',
        LPAD('ICIA',7,'#') AS LPAD1,
        RPAD('ICIA',7,'*') AS RPAD1,
        LPAD('ICIA',7) AS LPAD2,
        RPAD('ICIA',7) AS RPAD2
FROM DUAL;

--1.�ֹι�ȣ 910121-1******
--2.��ȭ��ȣ010-****-3288

SELECT RPAD('910121-1',13,'*')AS �ֹι�ȣ FROM DUAL;
SELECT RPAD(SUBSTR('910121-1234567',1,8),14,'*')AS �ֹι�ȣ FROM DUAL;

------------------------------


DROP TABLE JJJSSS;


CREATE TABLE JJJSSS(
    JSNAME NVARCHAR2(3),
    SSN NVARCHAR2(14),
    ASN NVARCHAR2(14)
);

INSERT INTO JJJSSS VALUES('������','910121-1234567','010-7342-3288');
INSERT INTO JJJSSS VALUES('������','456789-1234567','010-1234-5367');

SELECT*FROM JJJSSS;
 --�ֹι�ȣ
SELECT RPAD(SUBSTR(SSN,1,8),13,'*')AS �ֹι�ȣ FROM JJJSSS;

 --��ȭ��ȣ 010-****-1234
SELECT RPAD(SUBSTR(ASN,1,4),8,'*') || SUBSTR(ASN,9) AS ��ȭ��ȣ
FROM JJJSSS;


--1������ abc-1111-2222 �� 010-1111-abcd(ABCD)�� �����ϰ� ���ĺ��� �빮�ڷ� �����ϼ���. 
SELECT 
   UPPER (REPLACE ( REPLACE('abc-1111-2222','abc','010'),'2222','abcd')) AS "�����ϼ���"
FROM DUAL;

--2������ SCOTT���� ������ �÷��� ��ġ����. �̸�/��/�޿�
SELECT ENAME || JOB || SAL AS ��ü
FROM EMP;