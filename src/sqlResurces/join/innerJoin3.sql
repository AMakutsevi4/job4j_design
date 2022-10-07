CREATE TABLE accounts (
                          id int primary key,
                          login text,
                          password text
);

CREATE TABLE users (
                       u_id int primary key,
                       email text,
                       name text,
                       account_id int references accounts(id)
);

INSERT INTO accounts VALUES (1, 'login_1', '12345');
INSERT INTO accounts VALUES (2, 'login_2', '67890');

INSERT INTO users VALUES (1, 'email_1@mail.ru', 'first_name', 1);
INSERT INTO users VALUES (2, 'email_2@bk.ru', 'second_name', 2);


select id,login,password, email, name from accounts inner join users u on accounts.id = u.account_id;