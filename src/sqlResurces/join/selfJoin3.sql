CREATE TABLE films (
                       film_id int primary key,
                       title text,
                       length int
);

INSERT INTO films VALUES (1, 'Resurrection Silverado', 117),
                         (2, 'Graffiti Love', 117),
                         (3, 'Affair Prejudice', 117),
                         (4, 'Hurricane Affair', 49),
                         (5, 'Hook Chariots', 49),
                         (6, 'Heavenly Gun', 49),
                         (7, 'Doors President', 49),
                         (8, 'Sense Greek', 54),
                         (9, 'October Submarine', 54),
                         (10, 'Kill Brotherhood', 54);

select f1.title, f2.title, f2.length from films as f1
inner join films f2 on f1.title != f2.title and f1.length = f2.length;
