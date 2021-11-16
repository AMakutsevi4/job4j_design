create table passport(
id serial primary key, 
seria int,
number int
);

create table tax(
id serial primary key,
number int,
passport_id int references passport(id) unique);

insert into passport (seria, number) values ('2323', '454545');
insert into tax(number) values ('342342');

select from passport;
select from tax;
