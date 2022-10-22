package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        String num = String.valueOf(number);
        int index = 0;
        int[] result = new int[num.length()];
        for (int i = num.length(); i > 0; i--) {
            result[index++] = i;
        }
        return result;
    }
}
