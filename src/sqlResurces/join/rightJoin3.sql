CREATE TABLE accountts (
                          id int primary key,
                          email text,
                          password text
);

CREATE TABLE userrs (
                       id int primary key,
                       email text,
                       name text,
                       account_id int references accountts(id)
);

INSERT INTO accountts VALUES (1, 'for_auth_1@mail.ru', '12345');
INSERT INTO accountts VALUES (2, 'for_auth_1@bk.ru', '67890');

INSERT INTO userrs VALUES (1, 'email_1@mail.ru', 'first_name', 1);
INSERT INTO userrs VALUES (2, 'email_2@bk.ru', 'second_name', null);
INSERT INTO userrs VALUES (3, 'email_3@mail.ru', 'third_name', null);
INSERT INTO userrs VALUES (4, 'email_4@bk.ru', 'fourth_name', 2);

select a.id, a.email, a.password, u.id, u.email, u.name from accountts as a
right join userrs u on a.id = u.account_id;