package ru.job4j.cycle;

public class Task14 {
    public static void loop(int a, int b) {
        StringBuilder w = new StringBuilder();
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i > 9) {
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