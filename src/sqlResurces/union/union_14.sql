CREATE TABLE customers9
(
    id         SERIAL PRIMARY KEY,
    first_name  VARCHAR(20) NOT NULL,
    last_name   VARCHAR(20) NOT NULL,
    amount NUMERIC DEFAULT 0
);

CREATE TABLE employees9
(
    id        SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name  VARCHAR(20) NOT NULL
);

INSERT INTO customers9(first_name, last_name, amount)
VALUES ('Иван', 'Иванов', 2000),
       ('Андрей', 'Аносов', 3000),
       ('Павел', 'Куров', 4200),
       ('Виктор', 'Добров', 2800),
       ('Петр', 'Петров', 2500),
       ('Артем', 'Рогов', 2800);

INSERT INTO employees9(first_name, last_name)
VALUES ('Гомер', 'Симпсон'),
       ('Иван', 'Иванов'),
       ('Петр', 'Петров'),
       ('Николай', 'Корпусов');


SELECT last_name, first_name
FROM customers9
UNION
SELECT last_name, first_name
FROM employees9
ORDER BY last_name;

