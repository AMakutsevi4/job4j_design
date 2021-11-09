create table telephone(
id serial primary key,
brand varchar(255),
model text,
year text,
made text
); 
insert into telephone(brand, model, year,made) values('Apple', 'XR', '2019','California');
update telephone set brand = 'Applecopy'; 
select * from telephone; 
delete from telephone; 
