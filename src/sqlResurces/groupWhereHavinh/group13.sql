CREATE TABLE employees1
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(50),
    department VARCHAR(50),
    age        INT
);

INSERT INTO employees1 (name, department, age)
VALUES ('John', 'HR', 28),
       ('Jane', 'IT', 32),
       ('Bob', 'Finance', 29),
       ('Alice', 'IT', 26),
       ('Charlie', 'HR', 30);

SELECT department, AVG(age) as avg
FROM employees1
WHERE age < 30
GROUP BY department;