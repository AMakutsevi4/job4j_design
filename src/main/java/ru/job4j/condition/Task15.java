package ru.job4j.condition;

public class Task15 {
    public static void multiplyByTwo(int number) {
        if (number > 0) {
            System.out.println(number * 2);
        }
        if (number <= 0) {
            System.out.println(number);
        }
    }

}