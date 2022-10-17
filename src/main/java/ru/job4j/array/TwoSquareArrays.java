package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] array = new int[left.length * left.length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                array[index++] = Math.max(left[i][j], right[i][j]);
            }
        }
        return array;
    }
}
