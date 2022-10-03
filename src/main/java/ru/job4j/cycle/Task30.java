package ru.job4j.cycle;

public class Task30 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = 100; i < 130; i++) {
            int three = i % 10;
                int count = num % 10;
                boolean r = three == count;
                if (r) {
                    w.append(i).append(" ");
                }
            }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}