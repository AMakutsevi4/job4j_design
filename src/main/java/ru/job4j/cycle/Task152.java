package ru.job4j.cycle;

public class Task152 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        StringBuilder e = new StringBuilder();
        StringBuilder r = new StringBuilder();
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                q.append(i).append(" ");
            }
            if (i % 3 == 0) {
                e.append(i).append(" ");
            }

            if (i % 4 == 0) {
                r.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        e.deleteCharAt(e.length() - 1);
        r.deleteCharAt(r.length() - 1);
        System.out.println(q);
        System.out.println(e);
        System.out.println(r);
    }
}
