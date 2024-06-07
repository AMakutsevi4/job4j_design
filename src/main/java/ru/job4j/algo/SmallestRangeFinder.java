package ru.job4j.algo;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {
        int index = 0;
        int[] data = new int[2];
        int minusOne = 0;
        int last = nums.length - 1;

        while (index < 1) {
            for (int i = 1; i < nums.length; i++, minusOne++) {

                if (nums[last] == nums[last - 1]) {
                    index = 2;
                    continue;
                }

                if (nums[i] == k && nums[i - 1] != k && nums[k + 1] != k) {
                    data[0] = i - 1;
                    data[1] = i + 1;
                    index++;
                }
                if (nums[minusOne] == nums[i]) {
                    data[0] = nums[minusOne];
                    data[1] = nums[--last];
                    index++;
                }
            }
        }
        return index == 1 ? data : null;
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
