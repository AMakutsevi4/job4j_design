package ru.job4j.array;

public class Task30 {
    public static void difference(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(Math.abs(num1 - num2));
    }
}