package ru.job4j.condition;

public class Task20 {
    public static void numCheck(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        if (num1 % 2 == 0
                & num2 % 2 == 0
                & num3 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
