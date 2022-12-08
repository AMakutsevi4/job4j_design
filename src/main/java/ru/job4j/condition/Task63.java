package ru.job4j.condition;

public class Task63 {
    public static void isDecreasing(int number) {
        System.out.println(number / 100 > number / 10 % 10
                && number / 10 % 10 > number % 10 ? "Да" : "Нет");
    }
}
