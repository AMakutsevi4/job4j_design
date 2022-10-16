package ru.job4j.array;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num1, num2, num3;
        int num4, num5, num6;
        num1 = number1 / 100;
        num2 = number1 % 100 / 10;
        num3 = number1 % 10;
        num4 = number2 / 100;
        num5 = number2 % 100 / 10;
        num6 = number2 % 10;
        String rsl = num1 + String.valueOf(num2) + num6;
        String string = num4 + String.valueOf(num5) + num3;
        System.out.println(rsl);
        System.out.println(string);
    }
}