package ru.job4j.array;


public class Task26 {
    public static void transform(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        int rsl = (num2 * 10 + num1) + 8;
        System.out.println(rsl);
    }
}
