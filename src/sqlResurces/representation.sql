create table type(
id serial primary key,
name varchar(65)
);

create table products(
id serial primary key,
type_id int references type(id),
name varchar(80),
price int
);

insert into type (name) values ('Онлайн-курс');
insert into type (name) values('Книга');
insert into type (name) values ('Вебинар');

insert into products(type_id, name, price)
values (1,'Программирование глубоких нейронных сетей',  38600);
insert into products(type_id, name, price)
values(1, 'Нейронные сети для анализа текстов', 49990);
insert into products(type_id, name,  price)
values(1, 'Нейронные сети для анализа изображений', 51000);
insert into products(type_id, name, price)
values(3, 'Планирование карьеры в Data Science', 5400);
insert into products(type_id, name, price)
values(1, 'Технологии обработки больших данных', 55000);
insert into products(type_id, name, price)
values(2, 'Инженерия искусственного интеллекта', 60000);
insert into products(type_id, name, price)
values(2, 'Философия java', 70000);
insert into products(type_id, name, price)
values(2, 'Java c 0 до трудоустройства за 1 час', 1000000);
insert into products(type_id, name, price)
values(3, 'SQL запросы', 20000);
insert into products(type_id, name, price)
values(3, 'SQL представление', 25000);
/**
select p.name, t.name
from products as p join type as t
on p.type_id = t.id;
*/

create view representation_test
as select p.name as product_name,
t.name as product_type,
p.price as product_price
from products as p join type as t
on p.type_id = t.id
where t.name = 'Онлайн-курс'
and p.price <= 50000
order by p.price desc;

select * from representation_test;