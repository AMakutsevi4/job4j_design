package ru.job4j.cycle;

public class Task53 {
    public static void loop(int n) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        for (int i = 2; count++ < n; i += i) {
            q.append(i).append(" ");
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
