package ru.job4j.cycle;

public class Task96 {
    public static void loop(int[] num) {
        int rsl = 500;
        for (int j : num) {
            if (rsl > j) {
                rsl = j;
            }
        }
        System.out.println(rsl);
    }
}