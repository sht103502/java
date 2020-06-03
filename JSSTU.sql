DROP TABLE JSSTU;
--JSSTU���̺� ����
--�ʱ�ȭ �ϱ����� �����ϰ� �Է�
CREATE TABLE JSSTU(
    STUNO NUMBER(4),
    STUNAME NVARCHAR2(5),
    STUAGE NUMBER(2),
    STUPHONE NVARCHAR2(4),
    STUBIRTH DATE,
    GROUPNO NUMBER(2),
    CONSTRAINT JSSTU_PK PRIMARY KEY(STUNO)--�������� PK(���߿� ��￹��//�⺻Ű)
);

DELETE FROM JSSTU;
--JSSTU���̺� �ִ� ��� ������ ����
INSERT INTO JSSTU VALUES (6301, '������', 27, '9128', '19940427', 5 ); 
INSERT INTO JSSTU VALUES (6302, '���μ�', 24, '0278', '19971002', 1 ); 
INSERT INTO JSSTU VALUES (6304, '�赵��', 26, '3510', '19950309', 4 );
INSERT INTO JSSTU VALUES (6305, '����', 25, '9532', '19960516', 1 );
INSERT INTO JSSTU VALUES (6306, '�輺��', 26, '2883', '19950410', 1 );
INSERT INTO JSSTU VALUES (6307, '���¼�', 24, '2883', '19970711', 3 );
INSERT INTO JSSTU VALUES (6308, '����', 24, '0892', '19970301', 1 );
INSERT INTO JSSTU VALUES (6310, '������', 24, '7954', '19970128', 6 );
INSERT INTO JSSTU VALUES (6312, '������', 26, '3756', '19951128', 4 );
INSERT INTO JSSTU VALUES (6313, '������', 23, '5667', '19980106', 2 );
INSERT INTO JSSTU VALUES (6315, '������', 21, '9401', '20000309', 2 );
INSERT INTO JSSTU VALUES (6316, '������', 20, '0255', '20010519', 3 );
INSERT INTO JSSTU VALUES (6317, '������', 26, '5446', '19950422', 6 );
INSERT INTO JSSTU VALUES (6318, '������', 27, '8896', '19941204', 5 );
INSERT INTO JSSTU VALUES (6319, '������', 26, '4452', '19950111', 6 );
INSERT INTO JSSTU VALUES (6320, '����', 26, '2639', '19950917', 3 );
INSERT INTO JSSTU VALUES (6321, '�̼���', 28, '5960', '19930529', 4 );
INSERT INTO JSSTU VALUES (6323, '������', 30, '3288', '19910121', 4 );
INSERT INTO JSSTU VALUES (6324, '������', 25, '5975', '19960618', 5 );
INSERT INTO JSSTU VALUES (6325, '������', 23, '7691', '19980728', 2 );
INSERT INTO JSSTU VALUES (6326, '����ȫ', 29, '5859', '19920211', 6 );
INSERT INTO JSSTU VALUES (6327, '������', 24, '9743', '19970403', 3 );
INSERT INTO JSSTU VALUES (6328, '��ȣ��', 23, '2837', '19980328', 5 );
INSERT INTO JSSTU VALUES (6329, '�ֵ���', 28, '5112', '19931113', 2 );


SELECT* FROM JSSTU;

--(1)���̺� ���� ���캸��
    DESC JSSTU;

--(2)ALIAS(��Ī)���� ��ȸ�ϱ�
   -- ��ȸ: �л���ȣ,�л��̸�,�л�����, ��ȭ��ȣ, �������, ��
   
SELECT  STUNO AS �л���ȣ, STUNAME AS �л��̸�, STUAGE AS �л�����, 
STUPHONE AS ��ȭ��ȣ ,STUBIRTH AS �������, GROUPNO AS ��
FROM JSSTU;

--(3)�ߺ� �����͸� ���� DISTINCT
--GROUPNO�� �˻�
SELECT GROUPNO FROM JSSTU;
--�ߺ� ����
SELECT DISTINCT GROUPNO FROM JSSTU;
--���̸� �˻�
SELECT STUAGE FROM JSSTU;
--�ߺ���������
SELECT DISTINCT STUAGE FROM JSSTU;

--(4)�����ϱ�
--1)�������� ASC.
--2)�������� DESC.
SELECT DISTINCT GROUPNO FROM JSSTU
ORDER BY GROUPNO ASC;--�ø�����

SELECT DISTINCT GROUPNO FROM JSSTU
ORDER BY GROUPNO DESC;--��������

SELECT STUBIRTH FROM JSSTU
ORDER BY STUBIRTH ASC;-- ������� �������� ����

SELECT STUNAME FROM JSSTU
ORDER BY STUNAME DESC;--�̸� �������� ����

--EX1) 2���� ����� �˻�
SELECT *FROM JSSTU 
WHERE GROUPNO= 2;
--EX2) �츮������  �̸��˻�
SELECT *FROM JSSTU 
WHERE GROUPNO= 4;
--EX3) �츮�������� �л���ȣ �˻�
SELECT STUNAME AS �̸�, STUNO AS �л���ȣ
FROM JSSTU WHERE GROUPNO = 4;
--EX4) �츮�������� �������� �˻�
SELECT * FROM JSSTU
WHERE GROUPNO =5
ORDER BY STUBIRTH DESC;

--(6) �ΰ��� �̻� ���� �˻�
--1)AND : ���ǽ� 1�� ���ǽ� 2 ��� ���� �� TRUE, �ϳ��� �����̸� FALSE
--2)OR : ���ǽ� 1�� ���ǽ� 2 ��� ������ �� FALSE, �ϳ��� ���̸� TRUE

--EX) ���̰� 25�� �̸鼭 1�� �λ�� 
SELECT *FROM JSSTU 
WHERE STUAGE =25 AND
GROUPNO =1;
--EX2) ���̰� 25�� �Ǵ� 25���� �л��� 5���� �л��� ��ȸ
SELECT *FROM JSSTU

WHERE STUAGE =25 OR STUAGE =26 
OR GROUPNO =5;

--(7) �������, ���ڿ���
SELECT *
FROM JSSTU
WHERE STUAGE >=26;

SELECT *
FROM JSSTU
WHERE STUNAME >='��'AND STUNAME<='��';--�达���� �̾������� 
-- 1�� , 3��, 5���� �л� ��ȸ
SELECT *
FROM JSSTU
WHERE GROUPNO=1 OR GROUPNO=3 OR GROUPNO=5;

--(8) IN ������
--���� �÷����� �������� ���ǰ˻�
SELECT*
FROM JSSTU
WHERE GROUPNO IN (1,3,5);

--1,3,5 ���� �ƴ��л� �˻�
SELECT*
FROM JSSTU
WHERE GROUPNO NOT IN (1,3,5);

--���̰� 23�̻� 25���� �� �л� ��ȸ
SELECT*
FROM JSSTU
WHERE STUAGE >=23 AND STUAGE <=25;

--(9)BTWEEN A AND B
--A ���� B������ �����͸� �˻�
/*
    SELECT *
    FROM [TABLE_NAME]
    WHERE [COL_NAME] BETWEEN �ּڰ� AND �ִ�;

*/
SELECT *
FROM JSSTU
WHERE STUAGE BETWEEN 23 AND 25;

--22�쿡�� 26 ���̰� �ƴ� �л� ��ȸ
SELECT*
FROM JSSTU
WHERE STUAGE NOT BETWEEN 22 AND 26;

--(10) LIKE,���ϵ� ī��
/*
SELECT *
FROM WHERE [COL_NAME] LIKE(...);
*/

--ù���ڰ� '��'���� �����ϴ� ������ ��ȸ
SELECT * 
FROM JSSTU
WHERE STUNAME LIKE '��%';

--�ι�° ���ڰ� '��' �� �����ϴ� ������ ��ȸ 
SELECT *
FROM JSSTU
WHERE STUNAME LIKE '_��%';

--����° ���ڰ� '��' �� �����ϴ� ������ ��ȸ
SELECT *
FROM JSSTU
WHERE STUNAME LIKE '__��%';

--'��' ���ڸ� �����ϴ� ��� ������ ��ȸ
SELECT *
FROM JSSTU
WHERE STUNAME LIKE '%��%';

--'��' ���ڸ� �����ϴ� ��� ������ ��ȸ
SELECT *
FROM JSSTU
WHERE STUNAME LIKE '%��%'; 

/*
���ϵ� ī��
_ : � ���̵� ������� �Ѱ��� ���� �����͸� �ǹ�
%: ���̶� ������� (���� ���°�쵵 ����) ��� ���� �����͸� �ǹ�

--�̸��� ���� ��,��, ��,�ְ� �ƴ� ����� ��ȸ
*/
SELECT *
FROM JSSTU
 WHERE STUNAME NOT LIKE '��%' AND STUNAME NOT LIKE '��%';
 
 --(11) IS NULL /IS NOT NULL
 --���ο� ���̺� �߰�, ��ȥ�ѻ���� 1 �ƴ� ����� 0����
 ALTER TABLE JSSTU ADD MERRY NUMBER(1);
 
 SELECT * FROM JSSTU;
 UPDATE JSSTU
 SET MERRY =1 --MERRY�� 1�� �ٲ��
 WHERE STUNAME='������';
 
 UPDATE JSSTU
 SET MERRY =1 --MERRY�� 1�� �ٲ��
 WHERE STUNAME='������';
 
 UPDATE JSSTU
 SET MERRY =0 --MERRY�� 1�� �ٲ��
 WHERE STUNAME='������';
 
UPDATE JSSTU
 SET MERRY =0 --MERRY�� 1�� �ٲ��
 WHERE STUNAME='��ȣ��';

SELECT *
FROM JSSTU
WHERE MERRY IS NOT NULL;





--3��ڿ� 25���� ��� ��� 
SELECT*
FROM JSSTU
WHERE STUAGE +3 = 25;


