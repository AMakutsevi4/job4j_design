package ru.job4j.array;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;
        int rsl = (num3 * 100 + num2 * 10 + num1) - 20;
        System.out.println(rsl);
    }
}
