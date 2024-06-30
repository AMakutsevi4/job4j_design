CREATE TABLE movies1
(
    id           INT PRIMARY KEY,
    title        VARCHAR(255),
    genre        VARCHAR(50),
    rating       DECIMAL(3, 1),
    release_year INT
);

INSERT INTO movies1
VALUES (1, 'Movie1', 'Drama', 8.5, 2020),
       (2, 'Movie2', 'Action', 7.8, 2019),
       (3, 'Movie3', 'Drama', 9.0, 2021),
       (4, 'Movie4', 'Action', 6.5, 2020),
       (5, 'Movie5', 'Comedy', 8.2, 2018),
       (6, 'Movie6', 'Comedy', 7.5, 2019),
       (7, 'Movie7', 'Drama', 8.0, 2021);


SELECT genre, COUNT(title), AVG(rating), MAX(rating), MIN(rating)
FROM movies1
GROUP BY genre
HAVING COUNT(DISTINCT rating) > 2;
