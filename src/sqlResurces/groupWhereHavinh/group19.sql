CREATE TABLE products2
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(100),
    category VARCHAR(50),
    price    INT
);

INSERT INTO products2 (name, category, price)
VALUES ('Laptop', 'Electronics', 1200),
       ('T-shirt', 'Clothing', 30),
       ('Smartphone', 'Electronics', 800),
       ('Book', 'Books', 20);

SELECT category, COUNT(name)
FROM products2
WHERE price > (SELECT AVG(price) FROM products2)
GROUP BY category;