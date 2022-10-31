package ru.job4j.cycle;

public class Task51 {
    public static void loop(int n, int m) {
        StringBuilder q = new StringBuilder();
        if (n == m && n == 1) {
            q.append("0").append(" ");
        }
        if (n == m && n > 1) {
            q.append(n * n).append(" ");
        }
        if (m > n) {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    q.append(i * i).append(" ");
                } else {
                    q.append(0).append(" ");
                }
            }
        }
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    q.append(i * i).append(" ");
                } else {
                    q.append(0).append(" ");
                }
            }
        }

        if (q.length() != 0) {
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
        }
    }
}
