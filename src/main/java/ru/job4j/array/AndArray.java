package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        return Arrays.stream(left)
                .distinct()
                .filter(l -> Arrays.stream(right).anyMatch(r -> r == l)).toArray();
    }
}