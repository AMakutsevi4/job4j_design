package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int one = 0;
        int two = 0;
        for (int q : data) {
            if (q > 0) {
                one++;
            } else {
                two++;
            }
        }
        return one % 2 == 0 || two % 2 != 0;
    }
}
