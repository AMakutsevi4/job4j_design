package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int index = 0;
        int count = 0;
        for (int[] i : data) {
            index += i.length;
        }
        int[] rsl = new int[index];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    rsl[count++] += data[i][j];
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
