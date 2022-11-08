package ru.job4j.cycle;

public class Task98 {
    public static void loop(int[] num) {
        int count = 0;
        int rsl = 0;
        for (int j : num) {
           if (j > 2) {
                rsl += j;
                count++;
            }
            if (j > 1) {
                rsl += j;
                count++;
            }
        }
        System.out.println(rsl / count);
    }
}
