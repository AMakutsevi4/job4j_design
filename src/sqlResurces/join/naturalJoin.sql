CREATE TABLE colorsw (
                        color_id int primary key,
                        name text
);

CREATE TABLE actionsw (
                         number int primary key,
                         description text,
                         color_id int references colorsw(color_id)
);

INSERT INTO colorsw VALUES(1, 'red');
INSERT INTO colorsw VALUES(2, 'white');
INSERT INTO colorsw VALUES(3, 'black');
INSERT INTO colorsw VALUES(4, 'purple');

INSERT INTO actionsw VALUES (1, 'draw red', 1);
INSERT INTO actionsw VALUES (2, 'pink panther', null);
INSERT INTO actionsw VALUES (3, 'use for painting', null);
INSERT INTO actionsw VALUES (4, 'use black hole', 2);


select * from colorsw natural join actionsw;