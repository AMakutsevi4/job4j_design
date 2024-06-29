CREATE TABLE sales2
(
    id           SERIAL PRIMARY KEY,
    category     VARCHAR(50),
    month_number INT,
    amount       INT
);

INSERT INTO sales2 (category, month_number, amount)
VALUES ('Electronics', 2, 1000),
       ('Clothing', 2, 500),
       ('Electronics', 1, 800),
       ('Books', 3, 300),
       ('Electronics', 1, 1200);



SELECT category, SUM(amount) as sum
FROM sales2
WHERE month_number = 2
GROUP BY category;
