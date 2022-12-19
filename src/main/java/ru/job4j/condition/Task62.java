package ru.job4j.condition;

public class Task62 {
    public static void isRising(int number) {
        System.out.println(number / 100 < number / 10 % 10 && number / 10 % 10 < number % 10 ? "Да" : "Нет");
    }
}
