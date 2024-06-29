CREATE TABLE scores
(
    student_id   SERIAL PRIMARY KEY,
    student_name VARCHAR(50),
    subject      VARCHAR(50),
    score        INT
);

INSERT INTO scores (student_name, subject, score)
VALUES ('Alice', 'Math', 85),
       ('Bob', 'Math', 78),
       ('Alice', 'Physics', 90),
       ('Bob', 'Physics', 88),
       ('Charlie', 'Math', 92),
       ('Charlie', 'Physics', 95);

SELECT subject, COUNT(score) as count, MAX(score) as max_grade
FROM scores
WHERE score > 85
GROUP BY subject;