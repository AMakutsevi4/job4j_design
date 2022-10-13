package ru.job4j.array;

public class Task71 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        StringBuilder q = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                s.append(arr[i]).append(" ");
            } else {
                q.append(arr[i]).append(" ");
            }
        }
        s.deleteCharAt(s.length() - 1);
        q.deleteCharAt(q.length() - 1);
        System.out.println(s);
        System.out.println(q);
    }
}
