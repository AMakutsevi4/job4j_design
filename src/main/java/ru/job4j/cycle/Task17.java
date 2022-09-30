package ru.job4j.cycle;

public class Task17 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Начало");
        for (int i = 1; i < 20; i++) {
            if (i > 9 && i % 2 == 0) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
        System.out.println("Конец");
    }
}