CREATE TABLE orders4
(
    id          INT PRIMARY KEY,
    customer_id INT,
    date        DATE,
    status      VARCHAR(50)
);

INSERT INTO orders4
VALUES (1, 101, '2023-01-05', 'Pending'),
       (2, 102, '2023-02-10', 'Shipped'),
       (3, 103, '2023-03-15', 'Delivered'),
       (4, 101, '2023-04-20', 'Pending'),
       (5, 104, '2023-05-25', 'Delivered'),
       (6, 102, '2023-06-30', 'Shipped'),
       (7, 105, '2023-07-05', 'Delivered'),
       (8, 103, '2023-08-10', 'Shipped'),
       (9, 101, '2023-09-15', 'Delivered'),
       (10, 104, '2023-10-20', 'Shipped');

SELECT status, COUNT(customer_id)
FROM orders4
GROUP BY status
HAVING COUNT(customer_id) > 3;