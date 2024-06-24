package ru.job4j.algo;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {
        int index = 1;
        int[] data = new int[2];
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (index != k) {
                right++;
                if (nums[i] < nums[right]) {
                    index++;
                } else {
                    left = right;
                    index = 1;
                }
            }
                data[0] = left;
                data[1] = right;
        }
        return index == k ? data : null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}
