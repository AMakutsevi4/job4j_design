package ru.job4j.condition;

public class Task73 {
    public static void midDigitLess(int num) {
        int one = num / 100;
        int two = num / 10 % 10;
        int three = num % 10;
        System.out.println(two < one && two < three ? "Да" : "Нет");
    }
}
