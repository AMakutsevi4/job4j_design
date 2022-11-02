package ru.job4j.cycle;

public class Task45 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 1;
        while (count < 5) {
            q.append(count++).append(num).append(" ");
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
