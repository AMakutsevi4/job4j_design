package ru.job4j.cycle;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        int index = 0;
        StringJoiner join = new StringJoiner(" ");
        for (int r : nums) {
            int rsl = 0;
            while (r > 0) {
                rsl += r % 10;
                r = r / 10;
            }
            if (rsl == 5) {
                break;
            } else {
                join.add(String.valueOf(nums[index++]));
            }
        } if (join.length() == 0) {
            System.out.print("");
        } else {
            System.out.println(join);
        }
    }
}
