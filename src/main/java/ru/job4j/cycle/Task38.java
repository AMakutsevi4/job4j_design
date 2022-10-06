package ru.job4j.cycle;

public class Task38 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 200; i < 223; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            if (one % 2 == 0 && two % 2 == 0) {
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }

}
