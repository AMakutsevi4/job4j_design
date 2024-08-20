CREATE TABLE top_rated_cars1
(
    model       VARCHAR(256),
    launch_year SMALLINT
);

CREATE TABLE most_reliable_cars1
(
    model       VARCHAR(256),
    launch_year SMALLINT
);

INSERT INTO top_rated_cars1
VALUES ('Chevrolet Silveradon', 2020),
       ('Nissan Roque', 2020),
       ('Mercedes-Benz GLB', 2019);

INSERT INTO most_reliable_cars1
VALUES ('Toyota Prius Prime', 2020),
       ('Nissan Roque', 2020),
       ('Kia Forte', 2019);

SELECT *
FROM top_rated_cars1
UNION
SELECT *
FROM most_reliable_cars1
ORDER BY model;