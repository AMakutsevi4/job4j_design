package ru.job4j.cycle;

public class Task18 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        System.out.println("Начало");
        for (int i = 1; i < 20; i++) {
            if (i > 9 && i % 4 == 0) {
                w.append(i).append('#').append(" ");
                continue;
            }
            if (i > 9 && i % 2 == 0) {
                w.append(i).append(" ");
            }

        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
        System.out.println("Конец");
    }
}
