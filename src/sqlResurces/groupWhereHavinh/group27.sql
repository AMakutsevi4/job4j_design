CREATE TABLE orders
(
    id          INT PRIMARY KEY,
    customer_id INT,
    date        DATE,
    amount      DECIMAL(10, 2)
);

INSERT INTO orders
VALUES (1, 1, '2023-01-05', 500.00),
       (2, 2, '2023-02-10', 750.50),
       (3, 3, '2023-03-15', 1200.25),
       (4, 1, '2023-04-20', 300.75),
       (5, 4, '2023-05-25', 900.80),
       (6, 2, '2023-06-30', 1100.00),
       (7, 5, '2023-07-05', 800.50),
       (8, 3, '2023-08-10', 950.25),
       (9, 1, '2023-09-15', 600.30),
       (10, 4, '2023-10-20', 400.50);


SELECT customer_id, SUM(amount)
FROM orders
GROUP BY customer_id
HAVING SUM(amount) > 1500;