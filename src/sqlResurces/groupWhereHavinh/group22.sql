CREATE TABLE employees3
(
    id            INT PRIMARY KEY,
    department_id INT,
    salary        DECIMAL(10, 2),
    position      VARCHAR(50)
);

INSERT INTO employees3
VALUES (1, 1, 70000.00, 'Manager'),
       (2, 1, 60000.00, 'Developer'),
       (3, 2, 75000.00, 'Manager'),
       (4, 2, 55000.00, 'Developer'),
       (5, 3, 80000.00, 'Manager'),
       (6, 3, 65000.00, 'Developer');

SELECT department_id,SUM(salary), AVG(salary)
FROM employees3
GROUP BY department_id
HAVING (SELECT AVG(salary)) > 65000;
