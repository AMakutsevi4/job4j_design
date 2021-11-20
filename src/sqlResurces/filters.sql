create table type(
id serial primary key,
name varchar(65)
);

create table product(
id serial primary key,
type_id int references type(id),
name varchar(40),
expired_date date,
price int
);

insert into type (name) values ('Сыр');
insert into type (name) values('Мясо');
insert into type (name) values ('Овощи');

insert into product(type_id, name, expired_date, price)
values (1,'Пармезан', '20.11.2022', 1000);
insert into product(type_id, name, expired_date, price)
values(1, 'Маскарпоне', '19.11.2021', 3000);
insert into product(type_id, name, expired_date, price)
values(2, 'Говядина', '01.12.2021', 600);
insert into product(type_id, name, expired_date, price)
values(2, 'Курятина', '12.11.2021', 350);
insert into product(type_id, name, expired_date, price)
values(3, 'Картошка', '12.12.2021', 90);
insert into product(type_id, name, expired_date, price)
values(3, 'Капуста', '10.12.2021', 60);

select t.name, p.name from type as t join product as p on t.id = p.type_id
where t.name = 'Сыр';

select * from product where name like '%Мороженое';

select * from product where expired_date < current_date;

select * from product
where price = (select max(price) from product);

select t.name,count(p.name) from type as t join product as p on t.id = p.type_id
group by t.name;

select t.name, p.name from type as t join product as p on t.id = p.type_id
where t.name = 'Сыр' or t.name = 'Молоко';

select t.name from type as t join product as p on t.id = p.type_id
group by t.name
having count(t.name) < 10;

select * from product inner join type t on product.type_id = t.id; 
