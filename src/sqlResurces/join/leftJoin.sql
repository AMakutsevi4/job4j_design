CREATE TABLE colors (
                        id int primary key,
                        name text
);

CREATE TABLE actions (
                         number int primary key,
                         description text,
                         color_id int references colors(id)
);

INSERT INTO colors VALUES(1, 'red');
INSERT INTO colors VALUES(2, 'white');
INSERT INTO colors VALUES(3, 'black');
INSERT INTO colors VALUES(4, 'purple');

INSERT INTO actions VALUES (1, 'draw red', 1);
INSERT INTO actions VALUES (2, 'use black hole', 2);

select c.id, c.name, a.number, a.description from colors as c
left join actions a on c.id = a.color_id;