create table body(
id serial primary key,
name varchar(45)
);

create table engine(
id serial primary key, 
name varchar(40)
);

create table gearbox(
id serial primary key,
name varchar(40)
);

create table car(
id serial primary key,
name varchar(40),
body_id int reference body(id),
engine_id int reference engine(id),
gearbox_id int reference gearbox(id)
);

insert into body(name) values ('Седан');
insert into body(name) values ('Купе');
insert into body(name) values ('Внедорожник');
insert into body(name) values ('Паркетник');

insert into engine(name) values ('Бензин');
insert into engine(name) values ('Дизель');
insert into engine(name) values ('Электрический');

insert into gearbox(name) values ('Механика');
insert into gearbox(name) values ('Автомат');
insert into gearbox(name) values ('Вариатор');


insert into car(name, body_id, engine_id, gearbox_id) 
values ('Toyota', 1,1,2);

insert into car(name, body_id, engine_id, gearbox_id) 
values ('Jeep', 3,2,1);

insert into car(name, body_id, engine_id, gearbox_id) 
values ('Nissan', 2,2,1);

insert into car(name, body_id) 
values ('Honda', 4);

insert into car(name, engine_id) 
values ('BMW', 2);

insert into car(name, gearbox_id) 
values ('Mercedes', 3);


--1. Вывести список всех машин и все привязанные к ним детали.
select * from car
         left join body b on car.body_id = b.id
         left join engine e on car.engine_id = e.id
         left join gearbox t on car.gearbox_id = t.id;

--2. Вывести отдельно детали, которые не используются в машине, кузова, двигатели, коробки передач.
select * from gearbox as t
         left join car c on t.id = c.gearbox_id
where c.id is null;

select * from body as b
         left join car c on b.id = c.body_id
where c.id is null;

select * from engine as e
         left join car c on e.id = c.engine_id
where c.id is null; 
