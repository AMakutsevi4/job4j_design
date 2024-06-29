CREATE TABLE orders1
(
    id         SERIAL PRIMARY KEY,
    client_id  INT,
    order_year INT,
    amount     INT
);

INSERT INTO orders1 (client_id, order_year, amount)
VALUES (1, 2023, 100),
       (2, 2023, 150),
       (1, 2023, 200),
       (3, 2023, 50),
       (2, 2023, 120);

SELECT client_id, COUNT(amount) as count
FROM orders1
WHERE order_year = 2023
GROUP BY client_id
ORDER BY client_id DESC;