package ru.job4j.condition;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int rsl = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    rsl += j;
                }
            }
            if (rsl % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
