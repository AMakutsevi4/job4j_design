create table sity( p
id serial primary key,
name varchar(40),
index int
);

create table population(  c
id serial primary key,
people int,
sity_id int references sity(id)
);

insert into sity (name, index) values ('Neryungri', 678967);
insert into sity (name, index) values ('Moscow', 101000);

insert into population(people, sity_id) values (58969, 1);
insert into population(people, sity_id) values (11920000, 2);

select p.people, s.name, s.index from population as p join sity as s on p.sity_id = s.id;
select p.people as Люди, s.name as Название, s.index as Индекс from population as p join sity as s on p.sity_id = s.id;
select p.people, s.name from population as p join sity as s on p.sity_id = s.id;
