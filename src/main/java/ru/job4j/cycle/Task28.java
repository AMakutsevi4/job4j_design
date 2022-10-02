package ru.job4j.cycle;

public class Task28 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = 10; i < 30; i++) {
            int first = i / 10;
            int second = i % 10;
            boolean r = (first + second) == num;
            if (r) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
