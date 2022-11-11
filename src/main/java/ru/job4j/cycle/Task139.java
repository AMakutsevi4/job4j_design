package ru.job4j.cycle;

public class Task139 {
    public static void loop(int num) {
        int rsl = 0;
        for (int i = num; i > 1; i--) {
            if (num % i == 0) {
                rsl = i;
            }
        }
        System.out.println(rsl);
    }
}