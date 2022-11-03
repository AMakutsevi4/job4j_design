package ru.job4j.cycle;

public class Task86 {
    public static void loop(int num) {
        int rsl = num * 2;
        System.out.println(rsl / 10 + rsl % 10 == num / 10 + num % 10 ? "Да" : "Нет");
    }
}
