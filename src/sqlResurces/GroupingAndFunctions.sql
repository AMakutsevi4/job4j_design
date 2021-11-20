create table devices( 
    id serial primary key,
    name varchar(255),
    price float
);

create table people( 
    id serial primary key,
    name varchar(255)
);

create table devices_people( 
    id serial primary key,
    device_id int references devices(id),
    people_id int references people(id)
);

insert into devices(name, price) values('MacBook', 545990);
insert into devices(name, price) values('asus tuf gaming', 61000);
insert into devices(name, price) values('ultrabook', 80000);

insert into people(name) values('Alexandr');
insert into people(name) values('Roman');

insert into devices_people(device_id, people_id) values (1, 1), (2, 1);
insert into devices_people(device_id, people_id) values (1, 2), (2, 2), (3, 2);

select avg(price) from devices;

select p.name, avg(d.price) 
from people as p inner join devices_people as dp on p.id = dp.people_id
inner join devices as d on dp.device_id = d.id
group by p.name

having avg(d.price) > 70000; 