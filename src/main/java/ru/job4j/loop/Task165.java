package ru.job4j.loop;

import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (isSimple(i)) {
                    joiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(joiner);
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
