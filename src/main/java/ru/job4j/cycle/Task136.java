package ru.job4j.cycle;

public class Task136 {
    public static void loop(int num) {
        int q = 2;
        if (num % 3 == 0) {
            q = 3;
        }
        System.out.println(Math.sqrt(num % q) == 0 ? "Да" : "Нет");
    }
}