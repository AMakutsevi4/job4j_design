create table users(
id serial primary key,
	users varchar(255)
);

create table role(
id serial primary key,
	role varchar(255)
);

create table rules(
id serial primary key,
	rules text
);

create table item(
id serial primary key,
	item varchar(255)
);

create table comments(
	id serial primary key,
	comments text
);

create table attachs(
id serial primary key,
	attachs int
);

create table state(
id serial primary key,
state text
);

create table category(
id serial primary key,
category text
);