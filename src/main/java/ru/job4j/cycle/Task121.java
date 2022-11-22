package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int r : nums) {
            int rsl = 0;
            while (r > 0) {
                rsl += r % 10;
                r = r / 10;
            }
         joiner.add(String.valueOf(rsl));
        }
        System.out.println(joiner);
    }
}