package ru.job4j.array;

import java.util.Arrays;

public class UpperCaseTwo {
    public static char[] onlyLowCase(char[] input) {
        int index = 0;
        char[] rsl = new char[input.length];
        for (char i : input) {
            if (Character.isLowerCase(i) && Character.isLetter(i)) {
                rsl[index++] = Character.toUpperCase(i);
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
