--1�� ����
--1�� ����(4��)
--�̷�
--�˻����� ���ǽ��� �Ѱ�, ��Ī���, �̸��� ��ȣ ���
--STUNO�� ��Ī�� '��ȣ'�� ����,
--���� 95������� ã�ƶ�. �̸���
SELECT STUNO AS ��ȣ, STUNAME FROM JSSTU WHERE STUBIRTH LIKE '95%';
 

--2�� ����(10��)
--�÷� �߰� (�Ź߻�����), ������� ���� (70,60,70,80)
--�߻���� ū ������� ��� ���� ��� NULL�� �����ϰ�
ALTER TABLE JSSTU ADD SHOESIZE NUMBER(3);
UPDATE JSSTU SET SHOESIZE = 70 WHERE STUNAME = '������';
UPDATE JSSTU SET SHOESIZE = 70 WHERE STUNAME = '������';
UPDATE JSSTU SET SHOESIZE = 80 WHERE STUNAME = '�赵��';
UPDATE JSSTU SET SHOESIZE = 60 WHERE STUNAME = '�̼���';

SELECT * FROM JSSTU;



SELECT * FROM JSSTU 
WHERE SHOESIZE IS NOT NULL 
ORDER BY SHOESIZE DESC;

--3�� ����(15��)
--�÷� �� ����(������ �������� ��ȥ���� ����)
--�˻����� ���ǽ��� ������ �÷� ���� null �÷� ���� ������ ���� ���
--���ǽ� : ��ȥ���� ���� ������ null���� ������ ���� ���

UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '������';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '������';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '�赵��';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '�̼���';

SELECT * FROM JSSTU WHERE MERRY=0 OR MERRY IS NOT NULL;


--4�� ����(20��)
--���ϵ�ī�� ��� �̸��� ���
--��ȭ��ȣ �� ��ȣ 3,4�� �ڸ��� 8�� �� �ο� ã�� 
SELECT * FROM JSSTU WHERE STUPHONE LIKE '%__8%';

--5�� ����(51��)
--�������� �ʴ� �� ã��;
--(�̸� �� ��° �� ��°�� '��'�� �ƴ� ��� �� ���̰� 25�� �̸��λ�� ã��)
SELECT * FROM JSSTU WHERE STUAGE < 25 AND STUNAME NOT LIKE '_��%';

--2�� ��������

--Q1. STUAGE�� 24 �̻�, MERRY�� 1, '��'���� COLUMN�� ��Ī(STUNAME = �̸�,MERRY = ��ȥ����, STUAGE = ����)�� ����� ������ ǥ�� 
SELECT STUNAME AS �̸�, MERRY AS ��ȥ����, STUAGE AS ���� FROM JSSTU
WHERE STUAGE >=24 AND MERRY=1 AND STUNAME LIKE '��%';
--Q2. STUPHONE ������ ���ڰ� '3'���� ������ �������� ��ü �� ǥ�� 
SELECT * FROM JSSTU WHERE STUPHONE LIKE '___3';
--Q3. ���̰� 26�� �̻�, ���� '��'���� �������� ��ü ���� ������������ ǥ��
SELECT * FROM JSSTU WHERE STUAGE >= 26 AND STUNAME LIKE '��%' ORDER BY STUAGE ASC;

--Q4. 2020�� ���� �������� 5���� 30���� �Ѵ� �������� STUAGE, STUNAME�� ������������ ǥ��
SELECT STUAGE, STUAGE+5 AS "5���� ����", STUNAME FROM JSSTU WHERE STUAGE+5 > 30 ORDER BY STUAGE, STUNAME ASC;
--Q5. ��� COLUMN�� ��Ī���� �ٲٰ� ���� ���(��, 1��,2������)�� ã�Ƽ� STUAGE�� �������� �������� �Ͽ� ��� ������ �� ǥ�� 

SELECT STUNO AS �л���ȣ, STUNAME AS �л��̸�, STUAGE AS ����, STUPHONE AS ��ȭ��ȣ, STUBIRTH AS ���,
GROUPNO AS ����ȣ, MERRY AS ��ȥ����, SHOESIZE AS �Ź�ũ��
FROM JSSTU WHERE STUBIRTH LIKE '___01%' OR STUBIRTH LIKE '___02%' ORDER BY STUAGE DESC;

--3�� ����
--<1��>
--1997��� �̻�, 2001��� ���� ����� �� 3���� ������� �����Ͻÿ�.
SELECT * FROM JSSTU WHERE (STUBIRTH LIKE '97%' OR STUBIRTH LIKE '98%' OR

STUBIRTH LIKE '99%' OR STUBIRTH LIKE '00%' OR STUBIRTH LIKE '01%') AND GROUPNO=3;

--<2��>
--��ȭ��ȣ �� ���ӵ� ���ڰ� �ִ� ����� �����Ͻÿ�.
SELECT * FROM JSSTU WHERE 
STUPHONE LIKE '%00%' OR 
STUPHONE LIKE '%11%' OR 
STUPHONE LIKE '%22%' OR
STUPHONE LIKE '%33%' OR 
STUPHONE LIKE '%44%' OR 
STUPHONE LIKE '%55%' OR 
STUPHONE LIKE '%66%' OR 
STUPHONE LIKE '%77%' OR 
STUPHONE LIKE '%88%' OR 
STUPHONE LIKE '%99%';
 
--<3��>
--�̸��� '��'�� ���� ����� �� 23������ 27�������� ������� ������������ �����Ͻÿ�.
SELECT * FROM JSSTU WHERE STUNAME LIKE '%��%' AND STUAGE BETWEEN 23 AND 27
ORDER BY STUAGE DESC;
--<4��>
--11���� ������ ����� �����Ͻÿ�.
SELECT * FROM JSSTU WHERE STUBIRTH LIKE '%11';
-- / ���� �����ؼ� ���
-- % �� �� ������ ���� ������ ������ٴ� �ǹ�
 
--<5��>
--1997�⿡ �¾ ����� �� ������ ���� ������� �����Ͻÿ�.
SELECT * FROM JSSTU WHERE STUBIRTH LIKE '97%' ORDER BY STUBIRTH ASC; 

--4�� ����
--1) ��, �� ���̺� �߰��ϱ�
ALTER TABLE JSSTU ADD STUGENDER NVARCHAR2(2);
 
--2) ������ ���� ���� �ο� �� Ȯ���ϱ�

-- ��ü �л� �� �޴�����ȣ�� ���ڸ��� 2~5�̸��� �л��� ���ϰ� ����� ������������ �����Ͻÿ�

SELECT * FROM JSSTU WHERE STUPHONE BETWEEN '2%' AND '5%' ORDER BY STUPHONE ASC;

-- ��ü �л� �� ���̰� 25���̸鼭 1���� �ƴ� ����� �˻��Ͻÿ�
SELECT * FROM JSSTU WHERE STUAGE=25 AND GROUPNO != 1;


-- ���̺� STURIDE�� �߰�
--  ������ ���� ���� �ִ� ����� 1 / �����Ű� �ִ� ����� 2 �� ���� �ְ� ������ �̿��ϴ� ����� ���ϼ���
-- ��ü �л��� ������ ������������ �����ϼ���.

--5�� ����

--1. ������ 6���� ���

SELECT * FROM JSSTU

WHERE STUBIRTH LIKE '____6%';

 

--2. �л���ȣ ���ڸ� �� �ڸ��� 1~20�λ�� 

SELECT * FROM JSSTU

WHERE STUNO LIKE '__0%' OR STUNO LIKE '__1%' OR STUNO LIKE '__20%';

 

--3. �ڵ�����ȣ�� 12345�� �� ���� ��� ��ȸ
SELECT * FROM JSSTU
WHERE STUPHONE NOT LIKE '%1%' AND STUPHONE NOT LIKE '%2%' AND STUPHONE NOT LIKE '%3%' 
AND STUPHONE NOT LIKE '%4%' AND STUPHONE NOT LIKE '%5%'; 
 

--4. �̸��� �� ������ ��� ��ȸ
SELECT STUNAME FROM JSSTU WHERE STUNAME  LIKE '__';
 

--5. ���� �̾� �̸鼭 25���� ��� ��ȸ
SELECT * FROM JSSTU WHERE STUNAME LIKE '��%' AND STUAGE = 25;

--6�� ����
--���� 1) 1, 2, 3 �� �� 26�� ���� �л� �� �л���ȣ�� 20���̸��� �л� ��ȸ
SELECT * FROM JSSTU WHERE GROUPNO IN (1,2,3) AND STUAGE<=26 AND STUNO<6320;
--���� 2) 1, 2, 5���� ��� �߿� ���̰� 22~26���� ����� ���� '��'�� �������� �ʴ� �л� ��ȸ
SELECT * FROM JSSTU WHERE GROUPNO IN (1,2,5) AND (STUAGE BETWEEN 22 AND 26)
AND STUNAME NOT LIKE '��%' ;
 
--���� 3) 2, 4, 6�� �� ��ȭ��ȣ 4�ڸ� �� ù ��° ��ȣ�� 5�̸鼭 92����� �л� ��ȸ  
SELECT * FROM JSSTU WHERE GROUPNO IN (2,4,6) AND STUPHONE LIKE '5%'
AND STUBIRTH LIKE '92%' ;

--���� 4) 1, 2, 5, 6 ���� �л� �� 25�� �̻��̸� �л���ȣ�� 6320 �����̰� 4�����̸� ��ȭ��ȣ�� 5�� �� �л� ��ȸ
SELECT * FROM JSSTU WHERE  GROUPNO IN (1,2,5,6) AND STUAGE>=25
AND STUNO<=6320 AND STUBIRTH LIKE '____4%' AND STUPHONE LIKE '%5%' ;
--���� 5) ���� ��, �̰� �ƴ� ��� �߿��� �̸��� �� ��°�� '��'�� ���� ������ 1���� �л� ��ȸ
SELECT * FROM JSSTU WHERE STUNAME NOT LIKE '��%' AND STUNAME NOT LIKE '��%'
AND STUNAME LIKE '_��%' ;