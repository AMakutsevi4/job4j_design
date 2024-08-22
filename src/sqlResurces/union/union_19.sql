CREATE TABLE nobel_prize_chemistry3
(
    name VARCHAR(256),
    year SMALLINT
);

CREATE TABLE nobel_peace_prize3
(
    name VARCHAR(256),
    year SMALLINT
);

INSERT INTO nobel_prize_chemistry3
VALUES ('Мария Склодовская-Кюри', 1911),
       ('Лайнус Полинг', 1954),
       ('Фредерик Сенгер', 1958);

INSERT INTO nobel_peace_prize3
VALUES ('Джон Бардин', 1972),
       ('Лайнус Полинг', 1962),
       ('Международный комитет Красного Креста', 1944);


SELECT name
FROM nobel_prize_chemistry3
UNION
SELECT name
FROM nobel_peace_prize3
ORDER BY name;