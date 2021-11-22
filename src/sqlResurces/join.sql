
insert into departaments(name) values('Отдел продаж');
insert into departaments(name) values('Отдел логистики');


insert into emploers(name, departaments_id) values ('Александр',1);
insert into emploers(name, departaments_id) values ('Петр',2);
insert into emploers(name, departaments_id) values ('Вася',null);

select * from emploers e left join departaments d on e.departaments_id = d.id;
select * from departaments d right join emploers e on e.departaments_id = d.id;
select * from emploers e full join departaments d on e.departaments_id = d.id;
select * from emploers e cross join departaments d;
select * from departaments d left join emploers e on d.id = e.departaments_id where e.name is null;


create table teens(
id serial primary key,
	name varchar(255),
	gender varchar(255)
);
insert into teens(name, gender) values('Александр', 'мужчина');
insert into teens(name, gender) values('Мария', 'женщина');
insert into teens(name, gender) values('Петр', 'мужчина');
insert into teens(name, gender) values('Светлана', 'женщина');
select * from teens t cross join teens t1 where t.gender != t1.gender; 