package ru.job4j.cycle;

public class Task104 {
    public static void loop(int[] num) {
        int rsl = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {

         if (rsl < num[i]) {
                rsl = num[i];
                count = i;
            }
        }
        System.out.println(count);
    }
}