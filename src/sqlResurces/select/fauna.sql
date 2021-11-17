create table fauna (
    id serial primary key,
    name text,
    avg_age int,
    discovery_date date
);

insert into fauna(name, avg_age, discovery_date)
values('mammoth', 18250, date '1601-12-31');
insert into fauna(name, avg_age, discovery_date)
values('sawfish', 27500, date '1508-01-01');
insert into fauna(name, avg_age, discovery_date)
values('dog', 3650, null);
insert into fauna(name, avg_age, discovery_date)
values('monkey', 17000, null); 
insert into fauna(name, avg_age, discovery_date)
values('turtle', 109500, null);
insert into fauna(name, avg_age, discovery_date)
values('hamster', 100, null);

select * from fauna where name like '%fish%';
select * from fauna where avg_age>10000 and avg_age<21000;
select * from fauna where discovery_date is null;
select * from fauna where discovery_date < '1950-01-01'; 