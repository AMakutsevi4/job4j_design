CREATE TABLE sales
(
    seller_id  INT,
    product_id INT,
    quantity   INT
);

INSERT INTO sales
VALUES (1, 1, 10),
       (2, 2, 5),
       (1, 3, 8),
       (3, 4, 12),
       (2, 1, 15);

SELECT seller_id,  SUM(quantity)
FROM sales GROUP BY  seller_id;