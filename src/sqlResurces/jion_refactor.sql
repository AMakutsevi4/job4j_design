select  e.name, d.name from emploers e left join departaments d on e.departaments_id = d.id;

select  e.name, d.name from departaments d right join emploers e on d.id = e.departaments_id; 