package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task161 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            if (num(i)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static boolean num(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
