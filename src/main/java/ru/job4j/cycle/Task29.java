package ru.job4j.cycle;

public class Task29 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        for (int i = 100; i < 150; i++) {
            int one = i % 10;
            int two = i % 100 / 10;
            int three = i % 1000 / 100;
           boolean r = (one + two + three) == num;
            if (r) {
                w.append(i).append(" ");
            }
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
