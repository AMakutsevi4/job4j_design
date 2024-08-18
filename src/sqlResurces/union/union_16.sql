CREATE TABLE producers12
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

CREATE TABLE actors12
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

INSERT INTO producers12 (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро');

INSERT INTO actors12 (id, name)
VALUES (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (7, 'Брюс Уиллис');

SELECT *
FROM producers12
UNION
SELECT *
FROM actors12
ORDER BY name;