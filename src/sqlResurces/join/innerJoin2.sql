CREATE TABLE cars (
                      id int primary key,
                      model text
);

CREATE TABLE engines (
                         number int primary key,
                         volume decimal,
                         power int,
                         car_id int references cars(id)
);

INSERT INTO cars VALUES (1, 'Toyota Camry');
INSERT INTO cars VALUES (2, 'Renault Sandero');

INSERT INTO engines VALUES (1234, 2.5, 181, 1);
INSERT INTO engines VALUES (5678, 1.2, 75, 2);


select id, model, volume, power from cars inner join engines e on cars.id = car_id;