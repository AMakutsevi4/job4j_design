CREATE TABLE subjects(
                         id int not null primary key,
                         name text,
                         grade int,
                         start_date timestamp
);

INSERT INTO subjects VALUES(1, 'Math', 50, current_date);
INSERT INTO subjects VALUES(2, 'English', 75, current_date);
INSERT INTO subjects VALUES(3, 'Sociology', 65, current_date);
INSERT INTO subjects VALUES(4, 'Economics', 60, current_date);
INSERT INTO subjects VALUES(5, 'Computer Science', 70, current_date);


select * from subjects where grade >= 65 and grade <= 80;