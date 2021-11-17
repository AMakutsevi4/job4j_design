create table role(
id serial primary key,
	role varchar(255)
);

create table users(
id serial primary key,
	users varchar(255),
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
	item varchar(255),
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

insert into role(role) values('Admin');
insert into role(role) values('User');
insert into users(users, role_id) VALUES ('Bob', 1);
insert into rules(rules) values('full');
insert into rules(rules) values('half');
insert into role_rules(role_id, rules_id) values(1, 1);
insert into role_rules(role_id, rules_id) values(2, 2);
insert into category(category) values('online');
insert into state(state) values('experienced');
insert into item(item, users_id, category_id, state_id) values('uno', 1, 1, 1);
insert into comments(comments, item_id) values('important', 1);
insert into attachs(attachs, item_id) values(2, 1); 