package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int index = 0;
        int[] result = new int[ints.length];
        for (int q : ints) {
           result[index++] = q % number;
        }
        return result;
    }
}