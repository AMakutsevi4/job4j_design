package ru.job4j.cycle;

public class Task75 {
    public static void loop(int num) {
        int count = 1;
        int sum = 0;
        int rsl = 0;
        while (num > count) {
            if (num % 2 == 0) {
                sum += count++;
            }
        }
        if (sum % 2 == 0 && num % 2 == 0) {
            rsl++;
        }
        System.out.println(rsl > 0 ? "Да" : "Нет");
    }
}
