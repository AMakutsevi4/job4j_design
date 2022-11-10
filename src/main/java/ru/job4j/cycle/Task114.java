package ru.job4j.cycle;

public class Task114 {
    public static void loop(int[] nums) {
        int rsl = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                rsl += nums[i];
            }
        }
        System.out.println(rsl);
    }
}
