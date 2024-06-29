CREATE TABLE orders2
(
    id          SERIAL PRIMARY KEY,
    customer_id INT,
    city        VARCHAR(50),
    amount      INT
);

INSERT INTO orders2 (customer_id, city, amount)
VALUES (1, 'City_1', 100),
       (2, 'City_2', 150),
       (3, 'City_3', 200),
       (1, 'City_1', 200),
       (4, 'City_4', 50),
       (5, 'City_1', 120),
       (6, 'City_2', 100),
       (5, 'City_1', 150),
       (7, 'City_3', 200),
       (1, 'City_1', 50),
       (4, 'City_4', 120);

SELECT customer_id, COUNT(amount), MAX(amount)
FROM orders2
WHERE city = 'City_1'
GROUP BY customer_id;