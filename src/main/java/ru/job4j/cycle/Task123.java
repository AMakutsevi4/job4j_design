package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        if (num > 10) {
            int rsl = 0;
            int count = 0;
            while (num != 0) {
                rsl += num % 10;
                num = num / 10;
            }
            joiner.add(String.valueOf(rsl));
            if (rsl >= 10) {
                while (rsl != 0) {
                    count += rsl % 10;
                    rsl = rsl / 10;
                }
                joiner.add(String.valueOf(count));
            }
            System.out.println(joiner);
        }
    }
}