CREATE TABLE employee (
                          employee_id int primary key,
                          name text,
                          manager_id int references employee(employee_id)
);

INSERT INTO employee VALUES (1, 'Petr', null),
                            (2, 'Andrey', 1),
                            (3, 'Elena', 1),
                            (4, 'Anna', 2),
                            (5, 'Stas', 2),
                            (6, 'Sergey', 3),
                            (7, 'Alex', 3),
                            (8, 'Michael', 3);

select e.name, m.name from employee as e
left join employee m on m.employee_id = e.manager_id;