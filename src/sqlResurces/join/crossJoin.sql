CREATE TABLE letters (
                         l_id int primary key,
                         label char(1)
);

CREATE TABLE numbers (
                         n_id int primary key,
                         score int
);

INSERT INTO letters VALUES (1, 'A'),
                           (2, 'B');

INSERT INTO numbers VALUES (1, 1),
                           (2, 2),
                           (3, 3);

select * from letters
cross join numbers;