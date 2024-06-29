CREATE TABLE employees2
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(50),
    department VARCHAR(50),
    salary     INT
);

INSERT INTO employees2 (name, department, salary)
VALUES ('John', 'HR', 58000),
       ('Jane', 'IT', 62000),
       ('Bob', 'Finance', 63000),
       ('Alice', 'IT', 60000),
       ('Charlie', 'HR', 59000);

SELECT department, SUM(salary) as sum
FROM employees2
WHERE LENGTH(department) = 2
GROUP BY department
ORDER BY department DESC;