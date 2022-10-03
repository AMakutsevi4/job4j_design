package ru.job4j.cycle;

public class Task36 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 25; i < 30; i++) {
            q.append(i).append(" ");
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}