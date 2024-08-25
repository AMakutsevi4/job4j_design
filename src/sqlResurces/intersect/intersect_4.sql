CREATE TABLE customers11
(
    id         SERIAL PRIMARY KEY,
    first_name  VARCHAR(20) NOT NULL,
    last_name   VARCHAR(20) NOT NULL,
    amount NUMERIC DEFAULT 0
);

CREATE TABLE employees11
(
    id        SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name  VARCHAR(20) NOT NULL
);



INSERT INTO customers11(first_name, last_name, amount)
VALUES ('Иван', 'Иванов', 2000),
       ('Андрей', 'Аносов', 3000),
       ('Павел', 'Куров', 4200),
       ('Виктор', 'Добров', 2800),
       ('Петр', 'Петров', 2500),
       ('Артем', 'Рогов', 2800);

INSERT INTO employees11(first_name, last_name)
VALUES ('Гомер', 'Симпсон'),
       ('Иван', 'Иванов'),
       ('Петр', 'Петров'),
       ('Николай', 'Корпусов');

SELECT first_name, last_name
FROM customers11
INTERSECT
SELECT first_name, last_name
FROM employees11
ORDER BY last_name;