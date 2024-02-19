package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {

        char[][] result = new char[str.length / 2][str.length];
        char[] test = new char[str.length];
        int commonCount = 1;
        int count = 0;
        for (char value : str) {
            if (value != c) {
                test[count++] = value;
            } else {
                result[commonCount - 1] = Arrays.copyOf(test, count);
                count = 0;
                commonCount++;
            }
        }
        result[commonCount - 1] = Arrays.copyOf(test, count);
        return Arrays.copyOf(result, commonCount);

    }
}
