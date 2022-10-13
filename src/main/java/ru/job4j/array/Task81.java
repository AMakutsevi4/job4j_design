package ru.job4j.array;

public class Task81 {
    public static int[] array(int[] nums) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        int[] rsl = new int[3];
        for (int x : nums) {
            if (x < 0) {
                negative++;
            }
            if (x == 0) {
                zero++;
            }
            if (x > 0) {
                positive++;
            }
        }
        rsl[0] = negative;
        rsl[1] = zero;
        rsl[2] = positive;
        return rsl;
    }
}
