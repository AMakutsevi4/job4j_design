CREATE TABLE top_rated_films2
(
    title        VARCHAR NOT NULL,
    release_year SMALLINT
);

CREATE TABLE most_popular_films2
(
    title        VARCHAR NOT NULL,
    release_year SMALLINT
);


INSERT INTO top_rated_films2(title, release_year)
VALUES ('Побег из Шоушенка', 1994),
       ('Крестный отец', 1972),
       ('Темный рыцарь', 2008),
       ('12 разгневанных мужчин', 1957);

INSERT INTO most_popular_films2(title, release_year)
VALUES ('Американский огурчик', 2020),
       ('Крестный отец', 1972),
       ('Темный рыцарь', 2008),
       ('Грейхаунд', 2020);


SELECT *
FROM top_rated_films2
INTERSECT
SELECT *
FROM most_popular_films2
ORDER BY title;
