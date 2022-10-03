package ru.job4j.cycle;

public class Task33 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 100; i < 160; i++) {
            if (i % 11 == 0) {
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
