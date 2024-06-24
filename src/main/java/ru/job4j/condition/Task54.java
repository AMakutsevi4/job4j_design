package ru.job4j.condition;

public class Task54 {

    public static void transform(int number) {

        int num1 = Math.abs(number / 100);
        int num2 = Math.abs(number / 10 % 10);
        int num3 = Math.abs(number % 10);

        if (number % 2 == 0) {
            num1 = num1 % 2 == 0 ? num1 + 1 : num1 - 1;
            num2 = num2 % 2 == 0 ? num2 + 1 : num2 - 1;
            num3 = num3 % 2 == 0 ? num3 + 1 : num3 - 1;
        }
        if (number % 2 != 0) {
            num1 = num1 % 2 == 0 ? num1 - 1 : num1 + 1;
            num2 = num2 % 2 == 0 ? num2 - 1 : num2 + 1;
            num3 = num3 % 2 == 0 ? num3 - 1 : num3 + 1;
        }

        if (num1 > 9 || num1 < 0) {
            num1 = Math.abs(number / 100);
        }
        if (num2 > 9 || num2 < 0) {
            num2 = Math.abs(number / 10 % 10);
        }
        if (num3 > 9 || num3 < 0) {
            num3 = Math.abs(number % 10);
        }
        if (number < 0) {
            System.out.print("-");
        }
        if (num1 > 0) {
            System.out.print(num1);
        }
        System.out.print(num2);
        System.out.println(num3);
    }
}