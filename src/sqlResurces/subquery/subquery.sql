CREATE TABLE categories
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE products
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    quantity    INTEGER        NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    category_id INTEGER REFERENCES categories (id)
);

SELECT *
FROM products
WHERE  price > (SELECT AVG(price) FROM products);