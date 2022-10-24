package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int index = 0;
            int[] rsl = new int[left.length + right.length];
        for (int l : left) {
            rsl[index++] = l;
        }
        for (int j = 0; j < right.length; j++) {
            if (rsl[j] != right[j]) {
                rsl[index++] = right[j];
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
