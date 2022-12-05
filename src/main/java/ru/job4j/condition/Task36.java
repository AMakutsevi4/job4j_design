package ru.job4j.condition;

public class Task36 {
    public static void sameNums(int number) {
        System.out.println(number / 10 == number % 10 ? "Да" : "Нет");
    }
}