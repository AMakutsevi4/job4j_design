CREATE TABLE departments (
                             id int primary key,
                             name text not null
);

CREATE TABLE employees (
                           id int primary key,
                           name text,
                           department_id int references departments(id)
);

INSERT INTO departments VALUES (1, 'Sales'),
                               (2, 'Marketing'),
                               (3, 'HR'),
                               (4, 'IT'),
                               (5, 'Production');

INSERT INTO employees VALUES (1, 'Ivan Ivanov', 1),
                             (2, 'Petr Petrov', 1),
                             (3, 'Olga Sergeeva', 2),
                             (4, 'Michael Shnurov', 3),
                             (5, 'Irina Trubkina', 4),
                             (6, 'Evgenii Shtukov', null);

select e.name, d.name from employees as e
full outer join departments d on e.department_id = d.id