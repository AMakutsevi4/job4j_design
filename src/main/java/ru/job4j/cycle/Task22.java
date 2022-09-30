package ru.job4j.cycle;

public class Task22 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        for (int i = 46; i < 300; i++) {
            if (i % 80 == 45) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}

