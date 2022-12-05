package ru.job4j.condition;

public class Task35 {
    public static void gradeCheck(int grade) {
        System.out.println(grade >= 1 && grade <= 5 ? "Да" : "Нет");
    }
}
