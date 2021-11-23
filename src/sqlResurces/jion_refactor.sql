
insert into departaments(name) values('Отдел продаж');
insert into departaments(name) values('Отдел логистики');


insert into emploers(name, departaments_id) values ('Александр',1);
insert into emploers(name, departaments_id) values ('Петр',2);
insert into emploers(name, departaments_id) values ('Вася',null);

select * from emploers e left join departaments d on e.departaments_id = d.id
union
select * from emploers e right join departaments d on e.departaments_id = d.id;
