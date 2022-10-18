package ru.job4j.array;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;
        System.out.println(Integer.parseInt("" + num2 + num3 + num1));
    }
}