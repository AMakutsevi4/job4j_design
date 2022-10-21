package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int length = 0;
        for (int[] rows : array) {
            length += rows.length;
        }
        int sqArSize = (int) Math.ceil(Math.sqrt(length));
        int[][] rsl = new int[sqArSize][sqArSize];
        int row = 0, cell = 0;
        for (int[] rows : array) {
            for (int cells : rows) {
                rsl[row][cell++] = cells;
                if (cell == sqArSize) {
                    cell = 0;
                    row++;
                }
            }
        }
        return rsl;
    }
}