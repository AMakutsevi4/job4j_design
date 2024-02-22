package ru.job4j.loop;

public class Task31 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = 10; i <= 20; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            boolean r = one * two < num;
            if (r) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
