package ru.job4j.array;

public class Task32 {
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;
        num1 = number / 10;
        num2 = number % 10;
        counter = (num1 % 2 == 0 ? 1 : 0) + (num2 % 2 == 0 ? 1 : 0);

        System.out.println(counter);
    }
}