package ru.job4j.array;

public class Cinema {
    public static int[] checkEmptyPlace(char[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if ((i + j) % 2 == 0 && places[i][j] == 'O') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

