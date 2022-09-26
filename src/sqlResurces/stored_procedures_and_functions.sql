create table products
(
    id       serial primary key,
    name     varchar(50),
    producer varchar(50),
    count    integer default 0,
    price    integer
);

create or replace procedure insert_data(i_name varchar, prod varchar, i_count integer, i_price integer)
    language 'plpgsql'
as $$
BEGIN
    insert into products (name, producer, count, price)
    values (i_name, prod, i_count, i_price);
END
$$;

call insert_data('product_1', 'producer_1', 3, 50);
call insert_data('product_2', 'producer_2', 15, 32);
call insert_data('product_3', 'producer_3', 8, 115);

create or replace procedure update_data(u_count integer, tax float, u_id integer)
    language 'plpgsql'
as $$
BEGIN
    if u_count > 0 THEN
        update products set count = count - u_count where id = u_id;
    end if;
    if tax > 0 THEN
        update products set price = price + price * tax;
    end if;
END;
$$;

call update_data(10, 0, 1);
call update_data(0, 0.2, 0);

create or replace procedure delete_data(u_id integer)
    language 'plpgsql'
as $$
BEGIN
        delete from products
        where u_id = id;
END;
$$;

call delete_data(6);
call delete_data(5);


create or replace function f_insert_data(i_name varchar, prod varchar, i_count integer, i_price integer)
    returns void
    language 'plpgsql'
as
$$
begin
    insert into products (name, producer, count, price)
    values (i_name, prod, i_count, i_price);
end;
$$;

select f_insert_data('product_1', 'producer_1', 25, 50);
select f_insert_data('product_2', 'producer_2', 15, 32);
select f_insert_data('product_3', 'producer_3', 8, 115);

create or replace function f_update_data(u_count integer, tax float, u_id integer)
    returns integer
    language 'plpgsql'
as
$$
declare
    result integer;
begin
    if u_count > 0 THEN
        update products set count = count - u_count where id = u_id;
        select into result count from products where id = u_id;
    end if;
    if tax > 0 THEN
        update products set price = price + price * tax;
        select into result sum(price) from products;
    end if;
    return result;
end;
$$;

select f_update_data(10, 0, 1);
select f_update_data(0, 0.2, 0);

create or replace function f_delete_data(i_id varchar)
    returns void
    language 'plpgsql'
as
$$
begin
   delete from products
    where i_id = id and count = 0;
end;
$$;

select f_delete_data(8);
select * from products;