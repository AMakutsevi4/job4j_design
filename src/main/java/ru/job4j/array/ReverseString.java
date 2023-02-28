package ru.job4j.array;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        char[] test = new char[s.length];
        int index = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            test[index++] = s[i];
        }
        return test;
    }

    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(c));
    }
}
