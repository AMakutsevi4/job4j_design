package ru.job4j.cycle;

public class Task24 {
    public static void loop(int num) {
        StringBuilder w = new StringBuilder();
        int count = 0;
        for (int i = num - 10; count != 5; i -= 6) {
            count++;
            w.append(i).append(" ");
        }
        w.deleteCharAt(w.length() - 1);
        System.out.println(w);
    }
}
