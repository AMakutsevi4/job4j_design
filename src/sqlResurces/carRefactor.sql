
insert into body(name) values ('Седан');
insert into body(name) values ('Купе');
insert into body(name) values ('Внедорожник');
insert into body(name) values ('Паркетник');
insert into body(name) values ('Минивэн');

insert into engine(name) values ('Бензин');
insert into engine(name) values ('Дизель');
insert into engine(name) values ('Электрический');
insert into engine(name) values ('Гибрид');

insert into gearbox(name) values ('Механика');
insert into gearbox(name) values ('Автомат');
insert into gearbox(name) values ('Вариатор');
insert into gearbox(name) values ('Роботизированная');


insert into car(name, body_id, engine_id, gearbox_id) 
values ('Toyota', 1,1,2);

insert into car(name, body_id, engine_id, gearbox_id) 
values ('Jeep', 3,2,1);

insert into car(name, body_id, engine_id, gearbox_id) 
values ('Nissan', 2,2,1);

--1. Вывести список всех машин и все привязанные к ним детали.
select c.name as car, b.name as body, e.name as engine, g.name as gearbox from car c
left join body b on c.body_id = b.id
left join engine e on c.engine_id = e.id
left join gearbox g on c.gearbox_id = g.id; 

--2.Вывести детали которые не используются ни в одной машине, кузова, двигатели, коробки передач.

select * from body b left join car c on b.id = c.body_id where c.name is null;
select * from engine e left join car c on e.id = c.engine_id where c.name is null;
select * from gearbox g left join car c on g.id = c.gearbox_id where c.name is null; 