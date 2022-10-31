package ru.job4j.cycle;

public class Task72 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
