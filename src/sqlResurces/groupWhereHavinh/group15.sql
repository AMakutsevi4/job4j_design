CREATE TABLE grades1
(
    id         SERIAL PRIMARY KEY,
    student_id INT,
    subject    VARCHAR(50),
    grade      INT
);

INSERT INTO grades1 (student_id, subject, grade)
VALUES (1, 'Math', 85),
       (2, 'Math', 78),
       (1, 'Physics', 90),
       (2, 'Physics', 88),
       (3, 'Math', 92),
       (3, 'Physics', 95);


