package ru.job4j.cycle;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;
        for (int q : array) {
            if (q > array[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}