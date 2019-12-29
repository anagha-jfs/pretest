SELECT e.last_name, e.department_id, d.department_name
FROM employees e 
JOIN departments d
ON (e.department_id = d.department_id);

SELECT e.last_name, e.department_id, d.department_name
FROM employees e 
LEFT OUTER JOIN departments d
ON (e.department_id = d.department_id);

SELECT e.last_name, e.department_id, d.department_name
FROM employees e 
RIGHT OUTER JOIN departments d
ON (e.department_id = d.department_id);

SELECT e.last_name, e.department_id, d.department_name
FROM employees e 
FULL OUTER JOIN departments d
ON (e.department_id = d.department_id);

SELECT COUNT(last_name) FROM employees;
SELECT COUNT(department_name) FROM departments;

SELECT last_name, department_name
FROM employees
CROSS JOIN departments;

SELECT department_id, department_name,
location_id,city
FROM departments
NATURAL JOIN locations ;
