package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; i++) {
            seq[i] = '0';
            seq[seq.length - 1 - i] = '1';
        }
        return seq;
    }
}