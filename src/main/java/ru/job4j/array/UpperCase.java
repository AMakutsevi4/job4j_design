package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        int index = 0;
        char[] r = new char[string.length];
        for (char s : string) {
            r[index++] = Character.toUpperCase(s);
        }
        return r;
    }
}
