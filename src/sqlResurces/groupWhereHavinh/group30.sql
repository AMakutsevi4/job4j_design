CREATE TABLE airlines1
(
    id           INT PRIMARY KEY,
    name         VARCHAR(255),
    country      VARCHAR(255),
    headquarters VARCHAR(255)
);

CREATE TABLE airplanes1
(
    id               INT PRIMARY KEY,
    model            VARCHAR(255),
    manufacturer     VARCHAR(255),
    seating_capacity INT
);

CREATE TABLE flights1
(
    id              INT PRIMARY KEY,
    airline_id      INT REFERENCES airlines1 (id),
    airplane_id     INT REFERENCES airplanes1 (id),
    departure_date  DATE,
    flight_duration DECIMAL(5, 2)
);

INSERT INTO airlines1 (id, name, country, headquarters)
VALUES (1, 'Lufthansa', 'Germany', 'Cologne'),
       (2, 'Delta Air Lines', 'USA', 'Atlanta'),
       (3, 'Emirates', 'UAE', 'Dubai'),
       (4, 'Air France', 'France', 'Paris'),
       (5, 'Singapore Airlines', 'Singapore', 'Singapore');

INSERT INTO airplanes1 (id, model, manufacturer, seating_capacity)
VALUES (1, '737', 'Boeing', 150),
       (2, 'A320', 'Airbus', 170),
       (3, '777', 'Boeing', 300),
       (4, 'A380', 'Airbus', 555),
       (5, '747', 'Boeing', 416),
       (6, 'E190', 'Embraer', 100),
       (7, 'A350', 'Airbus', 440),
       (8, 'CRJ900', 'Bombardier', 90),
       (9, 'MD-11', 'McDonnell Douglas', 290),
       (10, '72', 'ATR', 70);

INSERT INTO flights1 (id, airline_id, airplane_id, departure_date, flight_duration)
VALUES (1, 1, 1, '2023-01-01', 2.5),
       (2, 2, 3, '2023-01-02', 3.0),
       (3, 3, 4, '2023-01-03', 8.5),
       (4, 4, 2, '2023-01-04', 2.0),
       (5, 5, 5, '2023-01-05', 7.5),
       (6, 1, 6, '2023-01-06', 1.5),
       (7, 2, 7, '2023-01-07', 4.0),
       (8, 3, 8, '2023-01-08', 6.5),
       (9, 4, 9, '2023-01-09', 5.0),
       (10, 5, 10, '2023-01-10', 3.5),
       (11, 1, 1, '2023-01-11', 2.0),
       (12, 2, 2, '2023-01-12', 1.0),
       (13, 3, 3, '2023-01-13', 4.5),
       (14, 4, 4, '2023-01-14', 2.5),
       (15, 5, 5, '2023-01-15', 6.0),
       (16, 3, 3, '2023-03-16', 4.5);


SELECT
    a.name AS name,
    COUNT(f.id) AS count
FROM
    flights1 f
JOIN
    airlines1 a ON f.airline_id = a.id
WHERE
    f.departure_date BETWEEN '2023-01-05' AND '2023-01-10'
GROUP BY
    a.name
HAVING
        COUNT(f.id) > 1;
