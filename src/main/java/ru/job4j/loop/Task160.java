package ru.job4j.loop;

public class Task160 {
    public static void loop(int num) {
        int rsl = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                rsl += i;
            }
        }
        System.out.println(rsl);
    }
}
