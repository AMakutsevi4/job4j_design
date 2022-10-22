package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            result.append(s).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}

