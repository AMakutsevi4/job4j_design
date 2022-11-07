package ru.job4j.cycle;

public class Task100 {
    public static void loop(int[] num) {
        int rsl = 0;
        int r = 0;
        for (int j : num) {
            int sum = j / 10 + j % 10;
            if (rsl < sum) {
                rsl = sum;
                r = j;
            }
        }
        System.out.println(r);
    }
}