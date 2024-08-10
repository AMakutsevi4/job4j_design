CREATE TABLE front_end
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE back_end
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO front_end (name)
VALUES ('Андрей'),
       ('Ольга'),
       ('Петр'),
       ('Екатерина'),
       ('Михаил');

INSERT INTO back_end (name)
VALUES ('Алексей'),
       ('Сергей'),
       ('Андрей'),
       ('Анна'),
       ('Петр');


SELECT name
FROM back_end
UNION ALL
SELECT name
FROM front_end
ORDER BY name;