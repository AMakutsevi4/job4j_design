package ru.job4j.cycle;

public class Task16 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Старт");
        for (int i = 1; i < 10; i++) {
            w.append(i).append(" ");

        }
        if (w.length() != 0) {
            w.deleteCharAt(w.length() - 1);
        }
        System.out.println(w);
        System.out.println("Финиш");
    }
}
