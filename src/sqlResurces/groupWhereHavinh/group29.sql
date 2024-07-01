CREATE TABLE airplanes
(
    id           SERIAL PRIMARY KEY,
    manufacturer VARCHAR(50),
    model        VARCHAR(50),
    seats        INT,
    range        INT
);

INSERT INTO airplanes(manufacturer, model, seats, range)
VALUES ('Airbus', 'A320', 150, 6000),
       ('Airbus', 'A330', 250, 8000),
       ('Boeing', '737', 120, 5500),
       ('Boeing', '747', 400, 10000),
       ('Embraer', 'E190', 100, 4500),
       ('Embraer', 'E195', 120, 5000),
       ('Bombardier', 'CRJ900', 90, 2500),
       ('Bombardier', 'Global 6000', 19, 11000),
       ('Cessna', 'Citation X', 8, 3700),
       ('Cessna', '172 Skyhawk', 4, 900);


SELECT manufacturer, AVG(seats)
FROM airplanes
GROUP BY manufacturer
HAVING AVG(seats) > 150;