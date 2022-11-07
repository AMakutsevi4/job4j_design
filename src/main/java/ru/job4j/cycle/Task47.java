package ru.job4j.cycle;

public class Task47 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 1350; i < 1450; i++) {
            int left = i / 1000 + i % 1000 / 100;
            int right = i % 100 / 10 + i % 10;
            if (left == right) {
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
