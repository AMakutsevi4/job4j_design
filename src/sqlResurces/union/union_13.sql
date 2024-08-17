CREATE TABLE book_details2
(
    id   INT PRIMARY KEY,
    name TEXT
);

CREATE TABLE top_selling_books2
(
    id   INT PRIMARY KEY,
    name TEXT
);

INSERT INTO book_details2(id, name)
VALUES (1, 'Великий Гэтсби'),
       (2, 'Портрет Дориана Грея'),
       (3, 'Большие надежды'),
       (4, 'Грозовой перевал'),
       (5, 'Бегущий за ветром'),
       (6, 'Над пропастью во ржи'),
       (7, 'Властелин колец'),
       (8, 'Тёмные начала'),
       (9, 'Убить пересмешника'),
       (10, 'Гроздья гнева'),
       (11, 'Франкенштейн'),
       (12, 'Думай и богатей');

INSERT INTO top_selling_books2(id, name)
VALUES (2, 'Портрет Дориана Грея'),
       (3, 'Большие надежды'),
       (4, 'Маленькие женщины'),
       (5, 'Паутина Шарлотты'),
       (6, 'Над пропастью во ржи'),
       (7, 'Властелин колец'),
       (10, 'Гроздья гнева'),
       (11, 'Франкенштейн'),
       (12, 'Думай и богатей');

SELECT name
FROM book_details2
UNION
SELECT name
FROM top_selling_books2
ORDER BY name;