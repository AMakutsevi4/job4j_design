package ru.job4j.array;

public class Task80 {
    public static int[] array(int[] nums) {
        int count = 0;
        int[] rsl = new int[nums.length];
        for (int num = 0; num < nums.length; num++) {
            int k = 0;
            for (int i : nums) {
                if (nums[num] == i) {
                    k++;
                }
            }
            if (k == 1) {
                rsl[count++] = num;
            }
        }

        int sizeArray = 0;
        int index = 0;

        for (int x = rsl.length; x > 1; x--) {
            if (rsl[x - 1] != 0) {
                sizeArray++;
            }
        }

        int[] test = new int[sizeArray + 1];
        for (int p = 0; p <= sizeArray; p++) {
            test[index] = rsl[p];
            index++;
        }
        return test;
    }
}