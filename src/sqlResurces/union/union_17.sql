CREATE TABLE directors7
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

CREATE TABLE actors7
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

INSERT INTO directors7 (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (6, 'Фрэнсис Форд Коппола');

INSERT INTO actors7 (id, name)
VALUES (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (7, 'Брюс Уиллис');


SELECT *
FROM directors7
UNION
SELECT *
FROM actors7
ORDER BY name;