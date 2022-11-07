package ru.job4j.cycle;

public class Task103 {
    public static void loop(int[] num) {
        int rsl = 500;
        int test = 0;
        for (int j : num) {
            int sum = j / 100 + j % 100 / 10 + j % 10;
            if (rsl > sum) {
                rsl = sum;
                test = j;
            }
        }
        System.out.println(test);
    }
}
