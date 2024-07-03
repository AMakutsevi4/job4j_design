CREATE TABLE products7
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(255)   NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE customers7
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE sales7
(
    id     SERIAL PRIMARY KEY,
    product_id  INT REFERENCES products7 (id),
    customer_id INT REFERENCES customers7 (id),
    amount      INT NOT NULL,
    sale_year   INT,
    sale_month  INT
);

INSERT INTO products7 (name, price)
VALUES ('Product A', 10.99),
       ('Product B', 20.49),
       ('Product C', 15.75),
       ('Product D', 8.99),
       ('Product E', 12.50),
       ('Product F', 18.99),
       ('Product G', 22.00);

INSERT INTO customers7 (name)
VALUES ('Customer 1'),
       ('Customer 2'),
       ('Customer 3'),
       ('Customer 4'),
       ('Customer 5');

INSERT INTO sales7 (product_id, customer_id, amount, sale_year, sale_month)
VALUES (1, 1, 2, 2023, 1),
       (2, 2, 1, 2023, 2),
       (3, 3, 3, 2023, 3),
       (4, 4, 4, 2023, 4),
       (5, 5, 2, 2023, 5),
       (6, 1, 1, 2023, 4),
       (7, 2, 3, 2023, 3),
       (1, 3, 2, 2023, 1),
       (2, 4, 4, 20235, 5),
       (3, 5, 1, 2023, 2),
       (4, 1, 3, 2023, 1),
       (5, 2, 2, 2023, 3),
       (6, 3, 1, 2023, 5),
       (7, 4, 4, 2023, 4),
       (1, 5, 3, 2023, 2),
       (2, 1, 2, 2023, 1),
       (3, 2, 1, 2023, 3);


SELECT p.id, p.name
FROM products7 p
JOIN sales7 s on p.id = s.product_id
WHERE s.sale_year = 2023
GROUP BY p.id, p.name
HAVING COUNT(amount) = 2;
