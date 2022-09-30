package ru.job4j.cycle;

public class Task23 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = num + 1; i < num + 6; i++) {
           w.append(i).append(" ");
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
