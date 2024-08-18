CREATE TABLE book_store9
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

CREATE TABLE book_store10
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

INSERT INTO book_store9 (id, title)
VALUES (1, 'Гиперион'),
       (2, '1984'),
       (3, 'Война и мир'),
       (4, 'Машина времени');

INSERT INTO book_store10 (id, title)
VALUES (3, 'Война и мир'),
       (4, 'Машина времени'),
       (5, 'Миссис Дэллоуэй');

SELECT *
FROM book_store9
UNION
SELECT *
FROM book_store10
ORDER BY title;