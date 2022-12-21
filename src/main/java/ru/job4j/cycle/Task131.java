package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task131 {
    public static void loop(int[] nums) {
        int count = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int r : nums) {
            if (r % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            joiner.add(String.valueOf(r));
        }
        System.out.println(joiner);
    }
}
