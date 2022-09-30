package ru.job4j.cycle;

public class Task15 {
    public static void loop(int a, int b) {
        StringBuilder w = new StringBuilder();
        System.out.println("Старт");
        for (int i = b; i > a; i--) {
            if (i > 99) {
                w.append(i).append(" ");
            }
        }
        if (w.length() != 0) {
            w.deleteCharAt(w.length() - 1);
        }
        System.out.println(w);
        System.out.println("Финиш");
    }
}
