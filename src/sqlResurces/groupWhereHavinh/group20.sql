CREATE TABLE orders3
(
    id          SERIAL PRIMARY KEY,
    customer_id INT            NOT NULL,
    date        DATE           NOT NULL,
    total       DECIMAL(10, 2) NOT NULL
);

INSERT INTO orders3 (customer_id, date, total)
VALUES (1, '2023-01-15', 150.50),
       (2, '2023-02-10', 200.00),
       (1, '2023-02-28', 300.75),
       (3, '2023-03-05', 120.00),
       (2, '2023-03-20', 250.30),
       (1, '2023-04-02', 180.20),
       (3, '2023-04-18', 90.50),
       (2, '2023-05-01', 300.00),
       (5, '2023-05-15', 200.80),
       (3, '2023-06-02', 150.25);


SELECT customer_id, COUNT (DISTINCT total) as count_total
FROM orders3
GROUP BY customer_id
HAVING COUNT(DISTINCT total) > 2
ORDER BY customer_id DESC
;