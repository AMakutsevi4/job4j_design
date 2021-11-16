create table supervisor(
    id serial primary key,
     name varchar(64) not null
);

create table subordinate(
    id serial primary key,
    name varchar(64) not null,
    supervisor_id int references supervisor(id)
);
insert into supervisor(name) values ('Bob');
insert into subordinate (name, supervisor_id) values ('Mike', '1');
insert into subordinate (name, supervisor_id) values ('Fedor', '1');

select * from supervisor;
select * from subordinate where id in (select id from supervisor);