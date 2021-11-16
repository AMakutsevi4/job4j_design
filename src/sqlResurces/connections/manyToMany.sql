create table movie(
id serial primary key, 
title varchar(65) not null);

create table actor(
id serial primary key,
name varchar(65) not null,
surname varchar(65) not null
);

create table movie_actor(
id serial primary key,
movie_id int references movie(id),
actor_id int references actor(id)
);

insert into movie(title) values ('Venom');
insert into movie(title) values ('Rocky');
insert into movie(title) values ('Green Mile');

insert into actor (name, surname) values ('Tom', 'Hardy');
insert into actor (name, surname) values ('Sylvester', 'Stallone');
insert into actor (name, surname) values ('Tom', 'Hanks');

insert into movie_actor(movie_id, actor_id) values (1,1);
insert into movie_actor(movie_id, actor_id) values (1,3);
insert into movie_actor(movie_id, actor_id) values (1,2);
insert into movie_actor(movie_id, actor_id) values (2,1);
insert into movie_actor(movie_id, actor_id) values (2,2);
insert into movie_actor(movie_id, actor_id) values (3,3);
insert into movie_actor(movie_id, actor_id) values (3,1);

select * from movie_actor;