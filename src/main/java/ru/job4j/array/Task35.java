package ru.job4j.array;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;
        String string = (num3 > 0 ? String.valueOf(num3) : "") + (num2 > 0 ? String.valueOf(num2) : "") + (num1 > 0 ? String.valueOf(num1) : "");
        System.out.println(string);
    }
}
