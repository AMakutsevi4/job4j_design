package ru.job4j.condition;

public class Task43 {
    public static void containsZero(int number) {
        System.out.println(number / 100 == 0
                || number / 10 % 10 == 0
                || number % 10 == 0 ? "Да" : "Нет");
    }
}
