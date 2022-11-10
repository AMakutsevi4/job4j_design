package ru.job4j.cycle;

public class Task115 {
    public static void loop(int[] nums) {
        int rsl = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                break;
            } else {
                rsl += nums[i];
            }
        }
        System.out.println(rsl);
    }
}
