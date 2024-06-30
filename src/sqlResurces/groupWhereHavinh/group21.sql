CREATE TABLE details
(
    id         INT PRIMARY KEY,
    product_id INT           NOT NULL,
    price      DECIMAL(8, 2) NOT NULL,
    quantity   INT           NOT NULL
);

INSERT INTO details (id, product_id, price, quantity)
VALUES (1, 2, 25.60, 2),
       (2, 1, 15.8, 3),
       (3, 3, 50.00, 1),
       (4, 4, 10.00, 5),
       (5, 5, 30.20, 2),
       (6, 2, 18.50, 4),
       (7, 2, 22.80, 3),
       (8, 1, 15.00, 6),
       (9, 3, 40.00, 1),
       (10, 4, 12.50, 4);


SELECT product_id, AVG(price)
FROM details
GROUP BY product_id
HAVING (SELECT AVG(price)) > 20;