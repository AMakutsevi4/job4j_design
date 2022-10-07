CREATE TABLE carrs (
                      id int primary key,
                      model text
);

CREATE TABLE enginees (
                         number int primary key,
                         volume decimal,
                         power int,
                         car_id int references carrs(id)
);

INSERT INTO carrs VALUES (1, 'Toyota Camry');
INSERT INTO carrs VALUES (2, 'Renault Sandero');

INSERT INTO enginees VALUES (1234, 2.5, 181, 1);
INSERT INTO enginees VALUES (5678, 1.2, 75, 2);
INSERT INTO enginees VALUES (1479, 1.6, 123, null);
INSERT INTO enginees VALUES (5072, 3.0, 231, null);


select c.id, c.model, e.number, e.volume, e.power from carrs as c
right join enginees e on c.id = e.car_id;