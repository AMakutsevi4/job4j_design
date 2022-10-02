package ru.job4j.cycle;

public class Task27 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = -num + 1; i < num; i++) {
            w.append(i).append(" ");
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
