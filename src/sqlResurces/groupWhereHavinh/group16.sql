CREATE TABLE movies
(
    movie_id SERIAL PRIMARY KEY,
    title    VARCHAR(100),
    genre    VARCHAR(50),
    rating   FLOAT
);

INSERT INTO movies (title, genre, rating)
VALUES ('Movie1', 'Action', 8.5),
       ('Movie2', 'Documentary', 7.3),
       ('Movie3', 'Drama', 7.8),
       ('Movie4', 'Detective', 9.0),
       ('Movie5', 'Action', 8.0),
       ('Movie6', 'Documentary', 8.1),
       ('Movie7', 'Comedy', 6.5),
       ('Movie8', 'Detective', 7.5),
       ('Movie9', 'Comedy', 5.9),
       ('Movie10', 'Documentary', 9.8),
       ('Movie11', 'Drama', 8.2);

SELECT  genre, AVG(rating)
FROM movies
WHERE genre LIKE 'D%'
GROUP BY  genre;