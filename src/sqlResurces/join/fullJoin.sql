CREATE TABLE collors (
                        id int primary key,
                        name text
);

CREATE TABLE actiions (
                         number int primary key,
                         description text,
                         color_id int references collors(id)
);

INSERT INTO collors VALUES(1, 'red');
INSERT INTO collors VALUES(2, 'white');
INSERT INTO collors VALUES(3, 'black');
INSERT INTO collors VALUES(4, 'purple');

INSERT INTO actiions VALUES (1, 'draw red', 1);
INSERT INTO actiions VALUES (2, 'pink panther', null);
INSERT INTO actiions VALUES (3, 'use for painting', null);
INSERT INTO actiions VALUES (4, 'use black hole', 2);

select * from collors
full join actiions a on collors.id = a.color_id;