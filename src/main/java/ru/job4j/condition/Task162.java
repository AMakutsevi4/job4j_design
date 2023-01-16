package ru.job4j.condition;

import java.util.StringJoiner;

public class Task162 {

    public static void loop() {

        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 150; i++) {
            for (int j = 2; j <= i; j++) {

                if (j < i & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    joiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(joiner);
    }
}
