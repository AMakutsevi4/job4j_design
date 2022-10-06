package ru.job4j.cycle;

public class Task137 {
    public static void loop(int num) {
        int rsl = 0;
        for (int i = 10; i < 1100; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            if ((one + two) == num) {
                rsl = i;
                break;
            }
        }
        System.out.println(rsl);
    }
}
