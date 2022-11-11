package ru.job4j.cycle;

public class Task140 {
    public static void loop(int num) {
        int rsl = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                rsl = i;
            }
        }
        System.out.println(rsl);
    }
}
