CREATE TABLE customers(
                          id int not null primary key,
                          first_name text,
                          last_name text,
                          active boolean,
                          email text
);

INSERT INTO customers VALUES(1, 'Ann', 'Furs', true, 'ann@bk.ru');
INSERT INTO customers VALUES(2, 'Andrey', 'Hincu', false, 'anincu@bk.ru');
INSERT INTO customers VALUES(3, 'Anne', 'Dow', true, 'anne@bk.ru');
INSERT INTO customers VALUES(4, 'Elena', 'Kartashova', false, 'ekart@bk.ru');
INSERT INTO customers VALUES(5, 'Annie', 'Sergeeva', true, 'annie@bk.ru');
INSERT INTO customers VALUES(6, 'Lana', 'Sergeeva', true, 'lserg@bk.ru');

select * from customers where length(first_name) between 3 and 5 and first_name like 'An%' ;

