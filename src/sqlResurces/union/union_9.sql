CREATE TABLE nobel_prize_chemistry
(
    name VARCHAR(256),
    year SMALLINT
);
CREATE TABLE nobel_peace_prize
(
    name VARCHAR(256),
    year SMALLINT
);

INSERT INTO nobel_prize_chemistry
VALUES ('Мария Склодовская-Кюри', 1911),
       ('Лайнус Полинг', 1954),
       ('Фредерик Сенгер', 1958);
INSERT INTO nobel_peace_prize
VALUES ('Джон Бардин', 1972),
       ('Лайнус Полинг', 1962),
       ('Международный комитет Красного Креста', 1944);

SELECT *
FROM nobel_prize_chemistry
UNION ALL
SELECT *
FROM nobel_peace_prize
ORDER BY name;