package ru.job4j.array;

public class Task72 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        StringBuilder q = new StringBuilder();
        for (int r : arr) {
            if (r % 2 == 0) {
                s.append(r).append(" ");
            } else {
                q.append(r).append(" ");
            }
        }
        if (s.length() != 0) {
            s.deleteCharAt(s.length() - 1);
            System.out.println(s);
        }
        if (q.length() != 0) {
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
        }
    }
}


