CREATE TABLE book_store13
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

CREATE TABLE book_store14
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

INSERT INTO book_store13 (id, title)
VALUES (1, 'Гиперион'),
       (2, '1984'),
       (3, 'Война и мир'),
       (4, 'Машина времени');

INSERT INTO book_store14 (id, title)
VALUES (3, 'Война и мир'),
       (4, 'Машина времени'),
       (5, 'Миссис Дэллоуэй');


SELECT *
FROM book_store13
INTERSECT
SELECT *
FROM book_store14
ORDER BY title;