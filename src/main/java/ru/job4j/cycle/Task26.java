package ru.job4j.cycle;

public class Task26 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < num * 2; i++) {
            w.append(-i * 8).append(" ");
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
