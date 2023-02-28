package ru.job4j.array;

import java.util.Arrays;

public class SortedSquares {
    public static int[] sorteds(int[] nums) {
        int index = 0;
        int[] rsl = new int[nums.length];
        for (int num : nums) {
            rsl[index++] = Math.abs(num * num);
        }
        Arrays.sort(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        int[] temp =  {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sorteds(temp)));
    }
}
