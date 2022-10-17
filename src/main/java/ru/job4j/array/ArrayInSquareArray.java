package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int dimSqArray = getDimSquareArray(array.length);
        int[][] squareArray = new int[dimSqArray][dimSqArray];
        int indexArray = 0;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (indexArray < array.length) {
                    squareArray[i][j] = array[indexArray++];
                } else {
                    squareArray[i][j] = 0;
                }
            }
        }
        return squareArray;
    }

    private static int getDimSquareArray(int lengthLineArray) {
        int squareRoot = (int) Math.sqrt(lengthLineArray);
        return squareRoot * squareRoot == lengthLineArray ? squareRoot : squareRoot + 1;
    }
}
