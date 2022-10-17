package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] array = new int[2 + (middle.length - 1) / 2 + right.length / 2];

        array[0] = left[0];
        array[array.length - 1] = left[left.length - 1];

        for (int i = 1; i < middle.length; i += 2) {
            array[i + 1] = middle[i];
        }
        for (int i = 0; i < right.length; i += 2) {
            array[i + 1] = right[i];
        }
        return array;
    }
}
