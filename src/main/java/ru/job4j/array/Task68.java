package ru.job4j.array;

public class Task68 {
    public static void array(int[] arr) {
        StringBuilder e = new StringBuilder();
        for (int j : arr) {
            e.append(j).append(" ");
        }
        e.deleteCharAt(e.length() - 1);
        System.out.println(e);
    }
}
