CREATE TABLE cars (
                      car_id int primary key,
                      model text
);

CREATE TABLE engines (
                         number int primary key,
                         volume decimal,
                         power int,
                         car_id int references cars(car_id)
);

INSERT INTO cars VALUES (1, 'Toyota Camry');
INSERT INTO cars VALUES (2, 'Kia Rio');
INSERT INTO cars VALUES (3, 'Audi A6');
INSERT INTO cars VALUES (4, 'Renault Sandero');

INSERT INTO engines VALUES (1234, 2.5, 181, 1);
INSERT INTO engines VALUES (1479, 1.6, 123, null);
INSERT INTO engines VALUES (5678, 1.2, 75, 4);
INSERT INTO engines VALUES (5072, 3.0, 231, null);


select * from cars
natural right join engines;