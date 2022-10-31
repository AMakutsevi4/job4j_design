package ru.job4j.cycle;

public class Task67 {
    public static void loop(int num) {
        if (num == 1) {
            System.out.println("Нет");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Нет");
                return;
            }
        }
        System.out.println("Да");
    }

}