package ru.job4j.cycle;

public class Task50 {
    public static void loop(int n) {
        StringBuilder s = new StringBuilder();
        int count = 5;
        int t = 0;
        for (int i = 1; t++ < count; i += n) {
            s.append(i).append(" ");
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
