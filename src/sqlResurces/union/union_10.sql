CREATE TABLE front_end1
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE back_end1
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO front_end1 (name)
VALUES ('Андрей'),
       ('Ольга'),
       ('Петр'),
       ('Екатерина'),
       ('Михаил');

INSERT INTO back_end1 (name)
VALUES ('Алексей'),
       ('Сергей'),
       ('Андрей'),
       ('Анна'),
       ('Петр');

SELECT name
FROM front_end1
UNION
SELECT name
FROM back_end1
ORDER BY name;