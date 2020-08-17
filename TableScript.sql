DROP TABLE CUSTOMER CASCADE CONSTRAINTS;

DROP SEQUENCE hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START WITH 1000 INCREMENT BY 1;

CREATE TABLE Customer (
	customer_id number(10),
	emailid varchar2(20),
	name varchar2(10),
	date_of_birth date,
	CONSTRAINT ps_customer_id_pk PRIMARY KEY (customer_id)
);

INSERT INTO Customer(customer_id, emailid, name, date_of_birth) VALUES (1, 'martin@infy.com', 'Martin', SYSDATE-9136);
commit;
select * from Customer;

