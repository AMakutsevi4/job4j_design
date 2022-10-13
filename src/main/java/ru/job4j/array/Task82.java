package ru.job4j.array;

public class Task82 {
    public static int[] array(int[] nums) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        int[] rsl = new int[3];
        for (int x : nums) {
            if (x < 0) {
                negative += x;
            }
            if (x == 0) {
                zero++;
            }
            if (x > 0) {
                positive += x;
            }
        }
        rsl[0] = positive;
        rsl[1] = negative;
        rsl[2] = zero;
        return rsl;
    }
}
