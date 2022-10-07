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
INSERT INTO cars VALUES (2, 'Kia Rio');
INSERT INTO cars VALUES (3, 'Audi A6');
INSERT INTO cars VALUES (4, 'Renault Sandero');

INSERT INTO engines VALUES (1234, 2.5, 181, 1);
INSERT INTO engines VALUES (5678, 1.2, 75, 4);

select c.id, c.model, e.number, e.volume, e.power from cars as c
left join engines e on c.id = e.car_id;