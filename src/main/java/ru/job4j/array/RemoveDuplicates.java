package ru.job4j.array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        System.out.println(removeDuplicates(array));
    }
}
