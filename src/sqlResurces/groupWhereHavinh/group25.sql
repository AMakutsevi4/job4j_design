CREATE TABLE employees5
(
    id            INT PRIMARY KEY,
    name          VARCHAR(255),
    department_id INT,
    age           INT
);

INSERT INTO employees5
VALUES (1, 'John Doe', 1, 25),
       (2, 'Jane Smith', 1, 28),
       (3, 'Bob Johnson', 2, 32),
       (4, 'Alice Brown', 2, 29),
       (5, 'Charlie White', 1, 26),
       (6, 'David Black', 3, 31),
       (7, 'Eva Green', 3, 27),
       (8, 'Frank Miller', 2, 30),
       (9, 'Grace Davis', 1, 29),
       (10, 'Henry Jones', 3, 33);


SELECT department_id, COUNT(name), AVG(age)
FROM employees5
GROUP BY department_id
HAVING AVG(age) < 30;