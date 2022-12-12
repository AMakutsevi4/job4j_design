package ru.job4j.condition;

public class Task49 {
    public static void isPalindrome(int number) {
        int d = number;
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(d == reverse ? "Да" : "Нет");
    }
}