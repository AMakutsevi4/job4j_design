package ru.job4j.cycle;

public class Task66 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                q.append(i).append(" ");
            }
        }
        if (q.length() != 0) {
            q.deleteCharAt(q.length() - 1);
            System.out.println("Количество: " + count + ", Делители: " + q);
        }
        if (q.length() == 0) {
            System.out.println("Количество: " + count + ", Делители: " + 0);
        }
    }
}
