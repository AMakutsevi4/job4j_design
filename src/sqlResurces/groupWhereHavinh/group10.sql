CREATE TABLE products1
(
    id INT PRIMARY KEY,
    category   VARCHAR(50),
    price      INT
);

CREATE TABLE sales1
(
    sale_id    INT PRIMARY KEY,
    product1_id INT references products1(id),
    quantity   INT
);

SELECT category, SUM(price * sales1.quantity)
FROM products1
JOIN sales1 ON products1.id = sales1.product1_id
GROUP BY category;