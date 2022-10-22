package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }
}

