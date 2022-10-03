package ru.job4j.cycle;

public class Task35 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        int rsl = num;
        while (count < 5) {
           rsl = rsl - 6;
            q.append(rsl).append(" ");
            count++;
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
