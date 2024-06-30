CREATE TABLE movies2
(
    id     INT PRIMARY KEY,
    title  VARCHAR(255),
    genre  VARCHAR(50),
    rating DECIMAL(3, 1)
);

INSERT INTO movies2
VALUES (1, 'The Shawshank Redemption', 'Drama', 9.3),
       (2, 'The Godfather', 'Crime', 9.2),
       (3, 'Pulp Fiction', 'Crime', 8.9),
       (4, 'The Dark Knight', 'Action', 9.0),
       (5, 'Schindler''s List', 'Biography', 8.9),
       (6, 'Forrest Gump', 'Drama', 8.8),
       (7, 'The Matrix', 'Action', 8.7),
       (8, 'Inception', 'Action', 8.8),
       (9, 'The Silence of the Lambs', 'Crime', 8.6),
       (10, 'The Departed', 'Crime', 8.5);

SELECT genre, COUNT(title), AVG(rating)
FROM movies2
GROUP BY genre
HAVING AVG(rating) > 9;