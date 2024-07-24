CREATE TABLE categories9
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE products9
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    quantity    INTEGER        NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    category_id INTEGER REFERENCES categories9 (id)
);

INSERT INTO categories9 (name)
VALUES ('Электроника'),
       ('Одежда'),
       ('Бытовая техника'),
       ('Книги'),
       ('Спортинвентарь');

INSERT INTO products9 (name, quantity, price, category_id)
VALUES ('Смартфон', 20, 1000.00, 1),
       ('Наушники', 15, 200.00, 1),
       ('Футболка', 30, 25.00, 2),
       ('Джинсы', 25, 50.00, 2),
       ('Холодильник', 10, 800.00, 3),
       ('Пылесос', 12, 150.00, 3),
       ('Роман', 40, 10.00, 4),
       ('Энциклопедия', 20, 30.00, 4),
       ('Футбольный мяч', 20, 15.00, 5),
       ('Теннисная ракетка', 15, 50.00, 5),
       ('Ноутбук', 18, 1200.00, 1),
       ('Тостер', 8, 40.00, 3),
       ('Футболка', 25, 20.00, 2),
       ('Спортивный костюм', 12, 70.00, 5),
       ('Научная литература', 30, 15.00, 4);

SELECT DISTINCT c.id, c.name
FROM categories9 c
         JOIN products9 p ON c.id = p.category_id
WHERE p.price > 1000;