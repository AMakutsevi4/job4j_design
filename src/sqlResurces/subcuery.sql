CREATE TABLE companies
(
    id   int primary key,
    city text
);

CREATE TABLE goods
(
    id         int primary key,
    name       text,
    company_id int references companies (id),
    price      int
);

CREATE TABLE sales_managers
(
    id          int primary key,
    last_name   text,
    first_name  text,
    company_id  int references companies (id),
    manager_fee int
);

CREATE TABLE managers
(
    id         int primary key,
    company_id int references companies (id)
);


INSERT INTO companies
VALUES (1, 'Москва'),
       (2, 'Нью-Йорк'),
       (3, 'Мюнхен');

INSERT INTO goods
VALUES (1, 'Небольшая квартира', 3, 5000),
       (2, 'Квартира в центре', 1, 4500),
       (3, 'Квартира у метро', 1, 3200),
       (4, 'Лофт', 2, 6700),
       (5, 'Загородный дом', 2, 9800);

INSERT INTO sales_managers
VALUES (1, 'Доу', 'Джон', 2, 2250),
       (2, 'Грубер', 'Ганс', 3, 3120),
       (3, 'Смит', 'Сара', 2, 1640),
       (4, 'Иванов', 'Иван', 1, 4500),
       (5, 'Купер', 'Грета', 3, 2130);

INSERT INTO managers
VALUES (1, 2),
       (2, 3),
       (4, 1);

SELECT * FROM sales_managers
WHERE manager_fee > (SELECT AVG(manager_fee) FROM sales_managers);