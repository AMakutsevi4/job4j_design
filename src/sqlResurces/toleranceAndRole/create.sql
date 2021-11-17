create table role(
id serial primary key,
	role varchar(65)
);

create table users(
id serial primary key,
	users varchar(65),
	role_id int references role(id)
);

create table rules(
id serial primary key,
	rules text
);

create table role_rules(
id serial primary key,
role_id int references role(id),
rules_id int references rules(id)
);

create table category(
id serial primary key,
category text
);

create table state(
id serial primary key,
state text
);

create table item(
id serial primary key,
	item varchar(65),
	users_id int references users(id),
	category_id int references category(id),
	state_id int references state(id)
);

create table comments(
	id serial primary key,
	comments text,
	item_id int references item(id)
);

create table attachs(
id serial primary key,
	attachs int,
	item_id int references item(id)
);