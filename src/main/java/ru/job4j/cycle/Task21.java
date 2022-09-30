package ru.job4j.cycle;

public class Task21 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Старт");
        for (int i = 38; i > 5; i--) {
            if (i % 5 == 0) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
        System.out.println("Финиш");
    }
}