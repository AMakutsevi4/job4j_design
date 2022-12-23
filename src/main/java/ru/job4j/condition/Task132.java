package ru.job4j.condition;

import java.util.StringJoiner;

public class Task132 {
    public static void loop(int[] nums) {
        int count = 0;
        StringJoiner joiner = new StringJoiner(" ");
          for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 2 != 0 && nums[i] % 2 == 0) {
                count++;
            }
            if (count < 3) {
                joiner.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(joiner);
    }
}