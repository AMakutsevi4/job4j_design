package ru.job4j.array;

public class Task70 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        StringBuilder q = new StringBuilder();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                s.append(arr[i]).append(" ");
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                q.append(arr[i]).append(" ");
            }
        }
        if (arr.length % 2 != 0) {
            for (int i = 0; i < (arr.length / 2) + 1; i++) {
                s.append(arr[i]).append(" ");
            }
            for (int i = (arr.length / 2) + 1; i < arr.length; i++) {
                q.append(arr[i]).append(" ");
            }
        }
        s.deleteCharAt(s.length() - 1);
        q.deleteCharAt(q.length() - 1);
        System.out.println(s);
        System.out.println(q);
    }
}
