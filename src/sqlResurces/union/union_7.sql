CREATE TABLE directors1
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);
CREATE TABLE actors1
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

INSERT INTO directors1 (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (6, 'Фрэнсис Форд Коппола');
INSERT INTO actors1 (id, name)
VALUES (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (7, 'Брюс Уиллис');

SELECT *
FROM directors1
UNION ALL
SELECT *
FROM actors1
ORDER BY name;