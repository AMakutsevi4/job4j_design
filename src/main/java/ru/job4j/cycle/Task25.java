package ru.job4j.cycle;

public class Task25 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        int count = 0;
        for (int i = 7; count < num; i += 4) {
            count++;
            w.append(i).append(" ");
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}