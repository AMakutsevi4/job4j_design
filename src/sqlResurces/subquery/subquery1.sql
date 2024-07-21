CREATE TABLE categories8
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE products8
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    quantity    INTEGER        NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    category_id INTEGER REFERENCES categories (id)
);

SELECT p.name AS name,
       p.quantity,
       c.name AS category_name
FROM
    products8 p
        JOIN categories8 c ON p.category_id = c.id
WHERE
        p.quantity > (SELECT AVG(quantity)
                      FROM products);