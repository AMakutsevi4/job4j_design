package ru.job4j.condition;

public class Task61 {
    public static void hasEqualDigits(int number) {
        System.out.println(number % 10 == number / 10 % 10 && number % 10 == number / 100 ? "Да" : "Нет");
    }
}