CREATE TABLE accounts (
                          id int primary key,
                          email text,
                          password text
);

CREATE TABLE users (
                       id int primary key,
                       email text,
                       name text,
                       account_id int references accounts(id)
);

INSERT INTO accounts VALUES (1, 'for_auth_1@mail.ru', '12345');
INSERT INTO accounts VALUES (2, 'for_auth_1@bk.ru', '67890');

INSERT INTO users VALUES (1, 'email_1@mail.ru', 'first_name', 1);
INSERT INTO users VALUES (2, 'email_2@bk.ru', 'second_name', 2);

select a.id, a.email, a.password, u.email, u.name from accounts as a
inner join users u on a.id = u.account_id;