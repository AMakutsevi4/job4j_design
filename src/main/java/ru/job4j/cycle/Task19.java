package ru.job4j.cycle;

public class Task19 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Старт");
        for (int i = 99; i < 153; i++) {
            if (i % 10 == 7) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
        System.out.println("Финиш");
    }
}

