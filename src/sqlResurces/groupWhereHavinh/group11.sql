CREATE TABLE grades
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(50),
    subject VARCHAR(50),
    grade   INT
);


INSERT INTO grades (name, subject, grade)
VALUES ('Alice', 'Math', 85),
       ('Jack', 'Math', 70),
       ('Bob', 'Math', 78),
       ('Alice', 'Physics', 90),
       ('Bob', 'Physics', 88),
       ('Charlie', 'Math', 92),
       ('Charlie', 'Physics', 95),
       ('Jack', 'Physics', 84);

SELECT  name, AVG(grade) as average
FROM grades
WHERE grade > 80
GROUP BY name
ORDER BY average DESC
LIMIT 3;

