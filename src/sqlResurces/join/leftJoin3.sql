CREATE TABLE accountss (
                          id int primary key,
                          email text,
                          password text
);

CREATE TABLE userss (
                       id int primary key,
                       email text,
                       name text,
                       account_id int references accountss(id)
);

INSERT INTO accountss VALUES (1, 'some_for_auth_1@mail.ru', '1_3_5');
INSERT INTO accountss VALUES (2, 'some_for_auth_1@bk.ru', '6%8%0');
INSERT INTO accountss VALUES (3, 'for_auth_1@mail.ru', '12345');
INSERT INTO accountss VALUES (4, 'for_auth_1@bk.ru', '67890');

INSERT INTO userss VALUES (1, 'email_1@mail.ru', 'first_name', 3);
INSERT INTO userss VALUES (2, 'email_2@bk.ru', 'second_name', 4);

select a.id, a.email, a.password, u.id, u.email, u.name from accountss as a
left join userss u on a.id = u.account_id;

