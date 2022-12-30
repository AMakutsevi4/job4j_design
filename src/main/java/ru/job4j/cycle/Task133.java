package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = num; i < 1_000; i *= num) {
            joiner.add(String.valueOf(i));
        }
        System.out.print(joiner.length() == 0 ? "" : joiner + System.lineSeparator());
    }
}
