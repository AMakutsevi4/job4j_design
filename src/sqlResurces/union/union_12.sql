CREATE TABLE nobel_prize_chemistry2
(
    name VARCHAR(256),
    year SMALLINT
);

CREATE TABLE nobel_prize_physic2
(
    name VARCHAR(256),
    year SMALLINT
);


INSERT INTO nobel_prize_chemistry2
VALUES ('Мария Склодовская-Кюри', 1911),
       ('Лайнус Полинг', 1954),
       ('Фредерик Сенгер', 1958);

INSERT INTO nobel_prize_physic2
VALUES ('Мария Склодовская-Кюри', 1903),
       ('Джон Бардин', 1956),
       ('Жорес Иванович Алфёров', 2000);


SELECT *
FROM nobel_prize_chemistry2
UNION ALL
SELECT *
FROM nobel_prize_physic2
ORDER BY name;