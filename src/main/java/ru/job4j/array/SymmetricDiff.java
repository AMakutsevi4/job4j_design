package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;

        for (int i : left) {
            boolean flag = false;
            for (int j : right) {
                if (i == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result[index++] = i;
            }
        }

        for (int i : right) {
            boolean flag = false;
            for (int j : left) {
                if (i == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result[index++] = i;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
