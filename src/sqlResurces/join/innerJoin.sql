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
INSERT INTO colors VALUES(2, 'black');

INSERT INTO actions VALUES (1, 'draw red', 1);
INSERT INTO actions VALUES (2, 'use black hole', 2);

select name, description from colors inner join actions on colors.id = actions.color_id;