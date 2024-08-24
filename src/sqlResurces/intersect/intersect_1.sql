CREATE TABLE front_end2
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE back_end2
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO front_end2 (name)
VALUES ('Андрей'),
       ('Ольга'),
       ('Петр'),
       ('Екатерина'),
       ('Михаил');

INSERT INTO back_end2 (name)
VALUES ('Алексей'),
       ('Сергей'),
       ('Андрей'),
       ('Анна'),
       ('Петр');


SELECT name
FROM front_end2
INTERSECT
SELECT name
FROM back_end2
ORDER BY name;

