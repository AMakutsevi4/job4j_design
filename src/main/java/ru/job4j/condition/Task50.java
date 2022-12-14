package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        System.out.println(num1 % 10 == num2 % 10 ? "Одинаковые" : Math.max(num1 % 10, num2 % 10));
    }
}
