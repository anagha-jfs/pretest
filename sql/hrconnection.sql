SELECT 100 + NULL FROM DUAL;

SELECT SALARY,SALARY + 100 FROM EMPLOYEES;

SELECT 500,12*500+100 FROM DUAL;

SELECT DISTINCT COMMISSION_PCT FROM EMPLOYEES ORDER BY COMMISSION_PCT;

SELECT SALARY,SALARY + 100 AS "COMPUTED VALUE" FROM EMPLOYEES;

SELECT 500,12*500+100 AS "TOTAL" FROM DUAL;

SELECT 500,12*500+100 TOTAL FROM DUAL;

SELECT FIRST_NAME,LAST_NAME FROM EMPLOYEES;

SELECT 'MR/MRS:'||FIRST_NAME,LAST_NAME FROM EMPLOYEES;

SELECT 'MR/MRS:'+FIRST_NAME,LAST_NAME FROM EMPLOYEES;

SELECT Q'[YOU ARE A WONDERFUL TRAINER ISN'T IT?]' FROM DUAL;

SELECT DISTINCT JOB_ID FROM EMPLOYEES;

SELECT COUNT(DISTINCT JOB_ID) FROM EMPLOYEES;

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID <106;
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID BETWEEN 103 AND 106;
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 106;
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID <> 106;
SELECT * FROM EMPLOYEES WHERE NOT EMPLOYEE_ID = 106;
SELECT * FROM EMPLOYEES WHERE  NOT EMPLOYEE_ID BETWEEN 101 AND 500;
SELECT * FROM EMPLOYEES WHERE MANAGER_ID IN (100,102);
SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE '%SS%';
SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE '%ss%';
SELECT * FROM EMPLOYEES WHERE UPPER(LAST_NAME) LIKE '%SS%';
SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE '___n'OR LAST_NAME LIKE '___r';
SELECT JOB_ID,FIRST_NAME FROM EMPLOYEES ORDER BY JOB_ID DESC, FIRST_NAME ASC;
SELECT JOB_ID,FIRST_NAME FROM EMPLOYEES ORDER BY JOB_ID DESC, FIRST_NAME DESC;
SELECT JOB_ID,FIRST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID = &ENTEREMPLOYEEID;


SELECT COMMISSION_PCT FROM EMPLOYEES;