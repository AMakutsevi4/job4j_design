package ru.job4j.array;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int rsl=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            rsl = Math.max(count, rsl);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] tmp = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(tmp));
    }
}
