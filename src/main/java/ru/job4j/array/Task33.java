package ru.job4j.array;

public class Task33 {
    public static void evenAmount(int number) {
        int num1, num2, num3, counter = 0;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;
        counter = (num1 % 2 == 0 ? 1 : 0) + (num2 % 2 == 0 ? 1 : 0) + (num3 % 2 == 0 ? 1 : 0);
        System.out.println(counter);
    }
}
