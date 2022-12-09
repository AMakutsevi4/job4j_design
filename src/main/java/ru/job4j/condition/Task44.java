package ru.job4j.condition;

public class Task44 {
    public static void containsZero(int number) {
        System.out.println(number % 10 <= 5 ? number - (number % 10) : number - (number % 10) + 10);
    }
}

