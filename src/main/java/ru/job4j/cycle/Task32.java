package ru.job4j.cycle;

public class Task32 {
    public static void loop() {
        StringBuilder w = new StringBuilder();
        for (int i = 50; i > 10; i--) {
            if (i % 10 == 7) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
