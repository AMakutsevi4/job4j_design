package ru.job4j.cycle;

public class Task46 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        while (count < 10) {
            q.append(1).append(num).append(count++).append(" ");
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
