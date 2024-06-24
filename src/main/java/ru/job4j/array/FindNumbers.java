package ru.job4j.array;

public class FindNumbers {
    public static int findNumbers(int[] nums) {
        int rsl = 0;
        int test = 0;
        for (int num : nums) {
            while (num > 0) {
                test++;
                num = num / 10;
            }
         if (test % 2 == 0) {
             rsl++;
         } else {
             test = 0;
         }
        }
        return rsl;
    }
}
