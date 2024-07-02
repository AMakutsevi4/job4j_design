CREATE TABLE film_companies4
(
    id            SERIAL PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    country       VARCHAR(50),
    founding_year INTEGER
);

CREATE TABLE directors4
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    birth_date  DATE,
    nationality VARCHAR(50)
);

CREATE TABLE movies4
(
    id           SERIAL PRIMARY KEY,
    title        VARCHAR(255) NOT NULL,
    release_year INTEGER,
    duration     INTEGER,
    budget       NUMERIC(15, 2),
    company_id   INTEGER REFERENCES film_companies4 (id),
    director_id  INTEGER REFERENCES directors4 (id)
);


INSERT INTO film_companies4 (name, country, founding_year)
VALUES ('Company A', 'USA', 1990),
       ('Company B', 'UK', 1985),
       ('Company C', 'Canada', 2000);

INSERT INTO directors4 (name, birth_date, nationality)
VALUES ('Director X', '1970-05-15', 'USA'),
       ('Director Y', '1982-08-22', 'UK'),
       ('Director Z', '1965-12-10', 'Canada'),
       ('Director W', '1978-03-30', 'USA');

INSERT INTO movies4 (title, release_year, duration, budget, company_id, director_id)
VALUES ('Movie 1', 2022, 120, 5000000, 1, 1),
       ('Movie 2', 2021, 105, 3000000, 2, 2),
       ('Movie 3', 2020, 130, 8000000, 3, 3),
       ('Movie 4', 2019, 110, 4000000, 1, 4),
       ('Movie 5', 2018, 95, 2000000, 2, 1),
       ('Movie 6', 2017, 115, 6000000, 3, 2),
       ('Movie 7', 2016, 125, 7000000, 1, 3),
       ('Movie 8', 2015, 100, 3500000, 2, 4),
       ('Movie 9', 2014, 90, 2500000, 3, 1),
       ('Movie 10', 2013, 135, 9000000, 1, 2),
       ('Movie 11', 2012, 80, 1800000, 2, 3),
       ('Movie 12', 2011, 140, 7500000, 3, 4),
       ('Movie 13', 2010, 105, 3200000, 1, 1),
       ('Movie 14', 2009, 125, 5500000, 2, 2),
       ('Movie 15', 2008, 110, 4000000, 3, 3);


SELECT
    name,
       COUNT(title),
       SUM(budget)
FROM
     movies4
JOIN
         film_companies4 f on movies4.company_id = f.id
WHERE
        movies4.release_year > 2012
GROUP BY
    name
;
