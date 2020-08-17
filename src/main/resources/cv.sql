--DROP DATABASE if exists CV_BACKEND;
--CREATE DATABASE CV_BACKEND;
--USE  CV_BACKEND;

--DROP SEQUENCE hibernate_sequence;
--CREATE SEQUENCE hibernate_sequence START WITH 1000 INCREMENT BY 4;

DROP TABLE CERTIFICATION;
DROP TABLE PERSON;
DROP TABLE EDUCATION;
DROP TABLE FEEDBACK;

CREATE TABLE PERSON(
	EMAIL_ID VARCHAR(50),
	NAME VARCHAR(50) NOT NULL,
	PHONE_NUMBER VARCHAR(10) NOT NULL UNIQUE,
	GIT VARCHAR(100) NOT NULL UNIQUE,
	LINKEDIN VARCHAR(100) NOT NULL UNIQUE,
	constraint CV_PERSON_EMAIL_ID_PK primary key ( EMAIL_ID )
);

CREATE TABLE EDUCATION(
	EDUCATION_ID VARCHAR(50),
	YEAR VARCHAR(50) NOT NULL,
	NAMEOFINS VARCHAR(100) NOT NULL,
	DEGREE VARCHAR(50) NOT NULL UNIQUE,
	MARKS VARCHAR(50) NOT NULL,
	constraint EDUCATION_ID_PK primary key (EDUCATION_ID)
);

CREATE TABLE FEEDBACK(
	EMAIL_ID VARCHAR(50),
	NAME VARCHAR(50) NOT NULL,
	COM VARCHAR(4000) NOT NULL,
	constraint CV_FEEDBACK_EMAIL_ID_PK primary key ( EMAIL_ID )
);

CREATE TABLE CERTIFICATION(
	CERTIFICATE_ID VARCHAR(4000),
	CERTIFICATE_NAME VARCHAR(4000) NOT NULL,
	CERTIFICATE_LINK VARCHAR(4000) NOT NULL,
	constraint CV_CERTIFICATE_ID_PK primary key ( CERTIFICATE_ID )
);

INSERT INTO PERSON (EMAIL_ID, NAME, PHONE_NUMBER,GIT,LINKEDIN) VALUES ('kaushiksuraj1102@gmail.com','Suraj Kaushik','7358740550','https://github.com/surajkaushik','https://www.linkedin.com/in/surajkaushik'); 

INSERT INTO EDUCATION VALUES ('1','2015-2019','SRM-Institute of Science and Technology','BTech-CSE','88.49');
INSERT INTO EDUCATION VALUES ('2','2014-2015','AIR FORCE SCHOOL','HIGHER SECONDARY','74.60');
INSERT INTO EDUCATION VALUES ('3','2012-2013','Kendriya Vidyalaya','SECONDARY','85.5');

INSERT INTO FEEDBACK values ('kaushiksuraj@gmail.com','Suraj','The colors of this blog make it look appealing. Also, the font size used is different from common ‘Times New Roman,’ which makes it appear better.');

INSERT INTO CERTIFICATION VALUES ('H209-7815','AZ-900: Microsoft Azure Fundamentals','https://drive.google.com/file/d/1-K1MM52gu7_Wa1jVGjjDXmB4c2hravsm/view?usp=sharing');
INSERT INTO CERTIFICATION VALUES ('3ef55f297200','Problem Solving (Basic)','https://www.hackerrank.com/certificates/3ef55f297200');
INSERT INTO CERTIFICATION VALUES ('2c76b10b8e1f','Java (Basic)','https://www.hackerrank.com/certificates/2c76b10b8e1f');
INSERT INTO CERTIFICATION VALUES ('220969','Azure Concepts(Linux Academy)','https://linuxacademy.com/profile/u/cert/id/220969');
INSERT INTO CERTIFICATION VALUES ('Ae-kcBVaJFiFEV6NUXXi0oBw0sf3','Learning Cloud Computing: Core Concepts','https://drive.google.com/file/d/1UbmloWBaPxYTUZv4Z8WVEzbdyQLpIliH/view?usp=sharing');
INSERT INTO CERTIFICATION VALUES ('d627fb2db3bc48ecabe0d59551de9d9c','Build Your Own Chatbot','https://courses.cognitiveclass.ai/certificates/d627fb2db3bc48ecabe0d59551de9d9c');
INSERT INTO CERTIFICATION VALUES ('DBPV4QWHY9RZ','Introduction to Relational Database and SQL','https://www.coursera.org/account/accomplishments/certificate/DBPV4QWHY9RZ');
INSERT INTO CERTIFICATION VALUES ('PWYQCM5CT5C8','Using Databases with Python','https://www.coursera.org/account/accomplishments/certificate/PWYQCM5CT5C8');
INSERT INTO CERTIFICATION VALUES ('76RV68EGBUBF','Technical Support Fundamentals','https://www.coursera.org/account/accomplishments/certificate/76RV68EGBUBF');
INSERT INTO CERTIFICATION VALUES ('DSSPRKREJHN4','Programming for Everybody','https://www.coursera.org/account/accomplishments/certificate/DSSPRKREJHN4');
INSERT INTO CERTIFICATION VALUES ('A3M7M36DDZB5','Python Data Structures','https://www.coursera.org/account/accomplishments/certificate/A3M7M36DDZB5');
INSERT INTO CERTIFICATION VALUES ('','','');
INSERT INTO CERTIFICATION VALUES ('','','');
INSERT INTO CERTIFICATION VALUES ('','','');
INSERT INTO CERTIFICATION VALUES ('','','');
INSERT INTO CERTIFICATION VALUES ('Ty2BZiMhj4cJKqsh8','Technology Consulting Virtual Internship (Deloitte)','https://insidesherpa.s3.amazonaws.com/completion-certificates/Deloitte/FqFtWwQzNxJ8Qsh5H_Deloitte_Rs6RysQXm9ouRBMC5_completion_certificate.pdf');




SELECT * FROM PERSON;
SELECT * FROM EDUCATION;
SELECT * FROM FEEDBACK;
SELECT * FROM CERTIFICATION;
