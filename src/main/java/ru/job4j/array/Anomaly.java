package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int[] test = new int[data.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                test[index++] = i;
            }
        }

        if (index > 1 && index < 4) {
            result[count++] = Arrays.copyOf(test, index);
        } else if (index == 1) {
            test[1] = test[0];
            result[count++] = Arrays.copyOf(test, 2);
        } else if (index == 4) {
            result[count++] = Arrays.copyOf(test, 2);
            test[0] = test[2];
            test[1] = test[3];
            result[count++] = Arrays.copyOf(test, 2);
        }
        result[count] = Arrays.copyOf(test, count);

        return Arrays.copyOf(result, count);
    }
}
