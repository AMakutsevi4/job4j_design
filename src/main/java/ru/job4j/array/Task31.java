package ru.job4j.array;

public class Task31 {
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;
        int rsl = (num1 - num3) * num2;
        System.out.println(Math.abs(rsl));
    }
}
