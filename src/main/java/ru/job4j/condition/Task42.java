package ru.job4j.condition;

public class Task42 {
    public static void isPairSymmetric(int number) {
        System.out.println(number / 100 == number % 100 ? "Да" : "Нет");
    }
}