package ru.job4j.cycle;

public class Task42 {
    public static void loop() {
        StringBuilder s = new StringBuilder();
        for (int i = 20; i <= 30; i++) {
            int one = i % 100 / 10;
            int two = i % 10;
            if (one % 3 != two % 3) {
                s.append(i).append(" ");
            }
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
