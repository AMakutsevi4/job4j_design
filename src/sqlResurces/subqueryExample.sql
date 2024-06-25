CREATE TABLE customers
(
    id         serial primary key,
    first_name text,
    last_name  text,
    age        int,
    country    text
);

INSERT INTO customers
VALUES (1,'Alex', 'Messi', 12, 'USA'),
       (2, 'Petr', 'first', 44, 'USSR'),
       (3, 'Evgeniy', 'BestMan', 28, 'RUSSIA'),
       (4, 'Vasya', 'Black', 12, 'CANADA');

CREATE TABLE orders
(
    id          serial primary key,
    amount      int,
    customer_id int references customers (id)
);

INSERT INTO orders
VALUES (1, 100, 1),
       (2,150,2),
       (4,100,4);

SELECT * FROM customers
WHERE customers.age = (SELECT MIN(age) FROM customers);

SELECT * FROM customers
WHERE customers.id NOT IN (SELECT customer_id FROM orders);