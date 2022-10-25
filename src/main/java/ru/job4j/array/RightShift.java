package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[i];
            nums[i] = temp;
        }
    }
}
