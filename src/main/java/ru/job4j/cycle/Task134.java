package ru.job4j.cycle;

public class Task134 {
    public static void loop(int num) {
        int index = 0;
        int rsl = 0;
        while (rsl <= num) {
            rsl += Math.pow(++index, 2);
        }
        rsl -= Math.pow(index, 2);
        System.out.println(rsl);
    }
}
