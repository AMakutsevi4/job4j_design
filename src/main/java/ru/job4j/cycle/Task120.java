package ru.job4j.cycle;

public class Task120 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        while (num > 0) {
            num = num / 10;
            q.append(num).append(" ");

        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}

