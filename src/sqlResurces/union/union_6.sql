CREATE TABLE directors
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

CREATE TABLE producers
(
    id   INT PRIMARY KEY,
    name VARCHAR(150)
);

INSERT INTO directors (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро'),
       (6, 'Фрэнсис Форд Коппола');

INSERT INTO producers (id, name)
VALUES (1, 'Джеймс Фрэнсис Кэмерон'),
       (2, 'Джонни Депп'),
       (3, 'Клинт Иствуд'),
       (4, 'Брэд Питт'),
       (5, 'Джон Фавро');

SELECT *
FROM directors
UNION ALL
SELECT * FROM
producers
ORDER BY name;