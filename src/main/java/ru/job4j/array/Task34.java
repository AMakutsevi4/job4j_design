package ru.job4j.array;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000;
        num2 = number % 1000 / 100;
        num3 = number % 100 / 10;
        num4 = number % 10;
        counter = (num1 % 2 == 0 ? 1 : 0) + (num2 % 2 == 0 ? 1 : 0) + (num3 % 2 == 0 ? 1 : 0) + (num4 % 2 == 0 ? 1 : 0);
        System.out.println(counter);
    }
}
