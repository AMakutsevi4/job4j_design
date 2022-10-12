package ru.job4j.array;

public class Task69 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            s.append(arr[i]).append(" ");
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
