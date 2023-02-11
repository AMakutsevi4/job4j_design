package ru.job4j.cache;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            boolean r = two + one <= num;
            if (r) {
                joiner.add(String.valueOf(i));
            }
        }
         System.out.println(joiner);
    }
}
