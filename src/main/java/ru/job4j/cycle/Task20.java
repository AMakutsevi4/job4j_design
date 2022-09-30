package ru.job4j.cycle;

public class Task20 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Начало");
        for (int i = 1500; i > 1050; i--) {
            if (i % 100 == 0) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
        System.out.println("Конец");
    }
}
