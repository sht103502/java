--1조 문제
--1번 문제(4점)
--이론
--검색문제 조건식이 한개, 별칭사용, 이름과 번호 출력
--STUNO의 별칭을 '번호'로 지정,
--나이 95년생들을 찾아라. 이름만
SELECT STUNO AS 번호, STUNAME FROM JSSTU WHERE STUBIRTH LIKE '95%';
 

--2번 문제(10점)
--컬럼 추가 (신발사이즈), 사이즈는 팀원 (70,60,70,80)
--발사이즈가 큰 순서대로 모든 값을 출력 NULL값 제외하고
ALTER TABLE JSSTU ADD SHOESIZE NUMBER(3);
UPDATE JSSTU SET SHOESIZE = 70 WHERE STUNAME = '신희태';
UPDATE JSSTU SET SHOESIZE = 70 WHERE STUNAME = '이유진';
UPDATE JSSTU SET SHOESIZE = 80 WHERE STUNAME = '김도연';
UPDATE JSSTU SET SHOESIZE = 60 WHERE STUNAME = '이소현';

SELECT * FROM JSSTU;



SELECT * FROM JSSTU 
WHERE SHOESIZE IS NOT NULL 
ORDER BY SHOESIZE DESC;

--3번 문제(15점)
--컬럼 값 변경(각각의 팀원들의 결혼여부 변경)
--검색문제 조건식이 변경한 컬럼 값과 null 컬럼 값을 제외한 내용 출력
--조건식 : 결혼하지 않은 팀원과 null값을 제외한 내용 출력

UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '신희태';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '이유진';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '김도연';
UPDATE JSSTU SET MERRY = 0 WHERE STUNAME = '이소현';

SELECT * FROM JSSTU WHERE MERRY=0 OR MERRY IS NOT NULL;


--4번 문제(20점)
--와일드카드 사용 이름만 출력
--전화번호 뒷 번호 3,4번 자리에 8이 들어간 인원 찾기 
SELECT * FROM JSSTU WHERE STUPHONE LIKE '%__8%';

--5번 문제(51점)
--포함하지 않는 값 찾기;
--(이름 두 번째 세 번째가 '민'이 아닌 사람 중 나이가 25살 미만인사람 찾기)
SELECT * FROM JSSTU WHERE STUAGE < 25 AND STUNAME NOT LIKE '_민%';

--2조 조별과제

--Q1. STUAGE가 24 이상, MERRY가 1, '이'씨인 COLUMN을 별칭(STUNAME = 이름,MERRY = 결혼여부, STUAGE = 나이)을 사용해 데이터 표시 
SELECT STUNAME AS 이름, MERRY AS 결혼여부, STUAGE AS 나이 FROM JSSTU
WHERE STUAGE >=24 AND MERRY=1 AND STUNAME LIKE '이%';
--Q2. STUPHONE 마지막 숫자가 '3'으로 끝나는 데이터의 전체 값 표시 
SELECT * FROM JSSTU WHERE STUPHONE LIKE '___3';
--Q3. 나이가 26살 이상, 성이 '이'씨인 데이터의 전체 값을 오름차순으로 표시
SELECT * FROM JSSTU WHERE STUAGE >= 26 AND STUNAME LIKE '이%' ORDER BY STUAGE ASC;

--Q4. 2020년 나이 기준으로 5년후 30살이 넘는 데이터의 STUAGE, STUNAME을 오름차순으로 표시
SELECT STUAGE, STUAGE+5 AS "5년후 나이", STUNAME FROM JSSTU WHERE STUAGE+5 > 30 ORDER BY STUAGE, STUNAME ASC;
--Q5. 모든 COLUMN을 별칭으로 바꾸고 빠른 년생(단, 1월,2월생만)을 찾아서 STUAGE를 기준으로 내림차순 하여 모든 데이터 값 표시 

SELECT STUNO AS 학생번호, STUNAME AS 학생이름, STUAGE AS 나이, STUPHONE AS 전화번호, STUBIRTH AS 출생,
GROUPNO AS 조번호, MERRY AS 결혼여부, SHOESIZE AS 신발크기
FROM JSSTU WHERE STUBIRTH LIKE '___01%' OR STUBIRTH LIKE '___02%' ORDER BY STUAGE DESC;

--3조 문제
--<1번>
--1997년생 이상, 2001년생 이하 사람들 중 3조인 사람들을 도출하시오.
SELECT * FROM JSSTU WHERE (STUBIRTH LIKE '97%' OR STUBIRTH LIKE '98%' OR

STUBIRTH LIKE '99%' OR STUBIRTH LIKE '00%' OR STUBIRTH LIKE '01%') AND GROUPNO=3;

--<2번>
--전화번호 중 연속된 숫자가 있는 사람을 도출하시오.
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
 
--<3번>
--이름에 '은'이 들어가는 사람들 중 23세에서 27세사이의 사람들을 내림차순으로 도출하시오.
SELECT * FROM JSSTU WHERE STUNAME LIKE '%은%' AND STUAGE BETWEEN 23 AND 27
ORDER BY STUAGE DESC;
--<4번>
--11일이 생일인 사람을 도출하시오.
SELECT * FROM JSSTU WHERE STUBIRTH LIKE '%11';
-- / 까지 포함해서 계산
-- % 는 그 공간에 뭐가 나오던 상관없다는 의미
 
--<5번>
--1997년에 태어난 사람들 중 생일이 빠른 순서대로 도출하시오.
SELECT * FROM JSSTU WHERE STUBIRTH LIKE '97%' ORDER BY STUBIRTH ASC; 

--4조 문제
--1) 남, 여 테이블에 추가하기
ALTER TABLE JSSTU ADD STUGENDER NVARCHAR2(2);
 
--2) 본인의 조에 남자 인원 수 확인하기

-- 전체 학생 중 휴대폰번호의 앞자리가 2~5미만인 학생을 구하고 결과를 오름차순으로 정렬하시오

SELECT * FROM JSSTU WHERE STUPHONE BETWEEN '2%' AND '5%' ORDER BY STUPHONE ASC;

-- 전체 학생 중 나이가 25살이면서 1조가 아닌 사람을 검색하시오
SELECT * FROM JSSTU WHERE STUAGE=25 AND GROUPNO != 1;


-- 테이블에 STURIDE를 추가
--  본인의 조에 차가 있는 사람은 1 / 자전거가 있는 사람은 2 의 값을 주고 도보를 이용하는 사람을 구하세요
-- 전체 학생들 성별을 오름차순으로 정렬하세요.

--5조 문제

--1. 생일이 6월인 사람

SELECT * FROM JSSTU

WHERE STUBIRTH LIKE '____6%';

 

--2. 학생번호 뒷자리 두 자리가 1~20인사람 

SELECT * FROM JSSTU

WHERE STUNO LIKE '__0%' OR STUNO LIKE '__1%' OR STUNO LIKE '__20%';

 

--3. 핸드폰번호에 12345가 안 들어가는 사람 조회
SELECT * FROM JSSTU
WHERE STUPHONE NOT LIKE '%1%' AND STUPHONE NOT LIKE '%2%' AND STUPHONE NOT LIKE '%3%' 
AND STUPHONE NOT LIKE '%4%' AND STUPHONE NOT LIKE '%5%'; 
 

--4. 이름이 두 글자인 사람 조회
SELECT STUNAME FROM JSSTU WHERE STUNAME  LIKE '__';
 

--5. 성이 이씨 이면서 25살인 사람 조회
SELECT * FROM JSSTU WHERE STUNAME LIKE '이%' AND STUAGE = 25;

--6조 문제
--문제 1) 1, 2, 3 조 중 26살 이하 학생 중 학생번호가 20번미만인 학생 조회
SELECT * FROM JSSTU WHERE GROUPNO IN (1,2,3) AND STUAGE<=26 AND STUNO<6320;
--문제 2) 1, 2, 5조인 사람 중에 나이가 22~26살인 사람에 성이 '이'로 시작하지 않는 학생 조회
SELECT * FROM JSSTU WHERE GROUPNO IN (1,2,5) AND (STUAGE BETWEEN 22 AND 26)
AND STUNAME NOT LIKE '이%' ;
 
--문제 3) 2, 4, 6조 중 전화번호 4자리 중 첫 번째 번호가 5이면서 92년생인 학생 조회  
SELECT * FROM JSSTU WHERE GROUPNO IN (2,4,6) AND STUPHONE LIKE '5%'
AND STUBIRTH LIKE '92%' ;

--문제 4) 1, 2, 5, 6 조인 학생 중 25살 이상이며 학생번호가 6320 이하이고 4월생이며 전화번호에 5가 들어간 학생 조회
SELECT * FROM JSSTU WHERE  GROUPNO IN (1,2,5,6) AND STUAGE>=25
AND STUNO<=6320 AND STUBIRTH LIKE '____4%' AND STUPHONE LIKE '%5%' ;
--문제 5) 성이 김, 이가 아닌 사람 중에서 이름에 두 번째가 '현'이 들어가는 생일이 1월인 학생 조회
SELECT * FROM JSSTU WHERE STUNAME NOT LIKE '김%' AND STUNAME NOT LIKE '이%'
AND STUNAME LIKE '_현%' ;