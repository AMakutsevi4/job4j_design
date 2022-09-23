create table products
(
    id       serial primary key,
    name     varchar(50),
    producer varchar(50),
    count    integer default 0,
    price    integer
);

create table history_of_price
(
    id    serial primary key,
    name  varchar(50),
    price integer,
    date  timestamp
);

-- statement trigger

create trigger after_trigger
    after insert
    on products
    referencing new table as inserted
    for each statement
execute procedure tax();


create or replace function tax()
    returns trigger as
$$
BEGIN
    update products
    set price = price * 1.2;
    return new;
end;
$$
    language 'plpgsql';



-- row trigger
create trigger before_trigger
    before insert
    on products
    for each row
execute procedure tax_before();


create or replace function tax_before()
    returns trigger as
$$
BEGIN
    new.price = price * 1.2;
    return NEW;
END;
$$
    language 'plpgsql';

-- row trigger save history
create trigger save_history
    after insert
    on products
    for each row
execute procedure save_price();

create or replace function save_price()
    returns trigger as
$$
BEGIN
    insert into history_of_price(name, price, date)
    values (new.name, new.price, now());
    return new;
end;
$$
    language 'plpgsql';


insert into products (name, producer, count, price)
VALUES ('product_3', 'producer_3', 8, 115);

insert into products (name, producer, count, price)
VALUES ('product_2', 'producer_2', 2, 20);

insert into products (name, producer, count, price)
VALUES ('product_1', 'producer_1', 3, 50);




