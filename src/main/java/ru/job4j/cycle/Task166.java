package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 10 == 0 && sumDel(i) % 10 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static int sumDel(int num) {
        int rsl = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0 && i % 2 != 0) {
                rsl += i;
            }
        }
        return rsl;
    }
}


