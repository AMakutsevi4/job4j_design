CREATE TABLE book_store1
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

CREATE TABLE book_store2
(
    id    INT PRIMARY KEY,
    title VARCHAR(100)
);

INSERT INTO book_store1 (id, title)
VALUES (1, 'Гиперион'),
       (2, '1984'),
       (3, 'Война и мир'),
       (4, 'Машина времени');

INSERT INTO book_store2 (id, title)
VALUES (3, 'Война и мир'),
       (4, 'Машина времени'),
       (5, 'Миссис Дэллоуэй');


SELECT *
FROM book_store1
UNION ALL
SELECT *
FROM book_store2
ORDER BY title;