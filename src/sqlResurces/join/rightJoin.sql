CREATE TABLE coolors (
                        id int primary key,
                        name text
);

CREATE TABLE aactions (
                         number int primary key,
                         description text,
                         color_id int references coolors(id)
);

INSERT INTO coolors VALUES(1, 'red');
INSERT INTO coolors VALUES(2, 'white');
INSERT INTO coolors VALUES(3, 'black');
INSERT INTO coolors VALUES(4, 'purple');

INSERT INTO aactions VALUES (1, 'draw red', 1);
INSERT INTO aactions VALUES (2, 'pink panther', null);
INSERT INTO aactions VALUES (3, 'use for painting', null);
INSERT INTO aactions VALUES (4, 'use black hole', 2);

select c.id,c.name, a.number, a.description from coolors as c
right join aactions a on c.id = a.color_id;