package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int rsl = 0;
        for (int i = 1; i < 10_000; i++) {

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    rsl += j;
                }
            }
            if (rsl == i) {
                joiner.add(String.valueOf(i));
            }
            rsl = 0;
        }
        System.out.println(joiner);
    }
}