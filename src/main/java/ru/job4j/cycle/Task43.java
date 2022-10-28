package ru.job4j.cycle;

public class Task43 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 310; i < 325; i++) {
            if ((i - 300) % (i / 100) == 0) {
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
