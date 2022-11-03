package ru.job4j.cycle;

public class Task111 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int sum = 0;
        for (int i = num + 1; i < num * num; i++) {
            if (sum < num * num) {
                q.append(i).append(" ");
                sum += i;
            }
        }
        if (q.length() == 0) {
            System.out.print("");
        } else {
            q.deleteCharAt(q.length() - 1);
            q.deleteCharAt(q.length() - 1);
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
        }
    }
}