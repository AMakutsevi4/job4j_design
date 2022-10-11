CREATE TABLE transactions(
                             id int not null primary key,
                             purpose text,
                             client_id int,
                             amount int,
                             payment_date timestamp
);

INSERT INTO transactions VALUES(1, 'Credit', 1, 132, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(2, 'Current payment', 2, 94, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(3, 'Service', 3, 197, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(4, 'Vacation', 4, 253, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(5, 'Delivery', 3, 167, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(6, 'Current payment', 4, 94, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(7, 'Service', 1, 167, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(8, 'Credit', 2, 253, '2022-06-01 12:00:00');
INSERT INTO transactions VALUES(9, 'Vacation', 1, 197, '2022-06-01 12:00:00');

select sum(distinct amount) from transactions;