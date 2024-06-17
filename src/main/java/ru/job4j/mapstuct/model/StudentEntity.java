package ru.job4j.mapstuct.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    private int id;
    private String name;
    private String classVal;
}