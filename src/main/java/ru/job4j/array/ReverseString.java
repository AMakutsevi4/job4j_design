package ru.job4j.array;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        char[] test = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            test[i] = s[s.length - i - 1];
        }
        return test;
    }

    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(c));
    }
}
