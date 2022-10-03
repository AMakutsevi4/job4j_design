package ru.job4j.cycle;

public class Task37 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        for (int i = 100; i < 130; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            int three = i % 1000 / 100;
            if (one * three == two * two) {
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
