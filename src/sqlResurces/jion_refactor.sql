insert into emploers(name, departaments_id) values ('Александр',1);
insert into emploers(name, departaments_id) values ('Петр',2);
insert into emploers(name, departaments_id) values ('Вася',null);

insert into departaments(name) values('Отдел продаж');
insert into departaments(name) values('Отдел логистики');

select * from emploers e left join departaments d on e.departaments_id = d.id;
select * from departaments d right join emploers e on d.id = e.departaments_id;

select * from departaments d left join emploers e on d.id = e.departaments_id;
select * from emploers e right join departaments d on e.departaments_id = d.id;
