CREATE TABLE nobel_prize_physic4
(
    name VARCHAR(256),
    year SMALLINT
);

CREATE TABLE nobel_peace_prize4
(
    name VARCHAR(256),
    year SMALLINT
);


INSERT INTO nobel_prize_physic4
VALUES ('Мария Склодовская-Кюри', 1903),
       ('Джон Бардин', 1956),
       ('Жорес Иванович Алфёров', 2000);

INSERT INTO nobel_peace_prize4
VALUES ('Джон Бардин', 1972),
       ('Лайнус Полинг', 1962),
       ('Международный комитет Красного Креста', 1944);


SELECT name
FROM nobel_prize_physic4
UNION
SELECT name
FROM nobel_peace_prize4
ORDER BY name ASC;