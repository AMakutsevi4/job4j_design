package ru.job4j.array;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3, num4;
        num1 = number / 1000;
        num2 = number % 1000 / 100;
        num3 = number % 100 / 10;
        num4 = number % 10;
        System.out.println(Integer.parseInt("" + num4 + num1 + num2 + num3));
    }
}