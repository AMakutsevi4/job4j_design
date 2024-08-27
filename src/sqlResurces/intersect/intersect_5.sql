CREATE TABLE directors8
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

CREATE TABLE actors8
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

INSERT INTO directors8 (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (6, 'Фрэнсис Форд Коппола');

INSERT INTO actors8 (id, name)
VALUES (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (7, 'Брюс Уиллис');


SELECT *
FROM directors8
INTERSECT
SELECT *
FROM actors8
ORDER BY name;

