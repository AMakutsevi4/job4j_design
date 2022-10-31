package ru.job4j.cycle;

public class Task49 {
    public static void loop(int n, int m) {
        if (m == n && m % 2 != 0) {
            System.out.print("");
        }
        if (m == n && m % 2 == 0) {
            System.out.println(m);
        }
        StringBuilder q = new StringBuilder();
        if (m > n) {
            for (int i = n + 1; i <= m; i += 2) {
                q.append(i).append("+");
            }
        }
        if (n > m) {
            for (int i = m + 1; i <= n; i += 2) {
                q.append(i).append("+");
            }
        }
        if (q.length() != 0) {
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
        }

    }
}
