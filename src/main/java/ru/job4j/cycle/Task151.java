package ru.job4j.cycle;

public class Task151 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                q.append(i * j).append(" ");
            }
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
            q.delete(0, q.length());
        }
    }
}
