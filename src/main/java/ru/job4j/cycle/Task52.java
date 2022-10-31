package ru.job4j.cycle;

public class Task52 {
    public static void loop(int n, int m) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        if (m > n || m == n) {
            for (int i = m; count++ < n; i++) {
                s.append(i).append(" ");
            }
        }
        if (n > m) {
            for (int i = n; count++ < m; i++) {
                s.append(i).append(" ");
            }
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
