package ru.job4j.cycle;

public class Task129 {
    public static void loop(int num) {
        int rsl = 0;
        while (num != 0) {
            rsl += num % 10;
            num = num / 10;
        }
        System.out.println(rsl);
    }
}
