package ru.job4j.cycle;

public class Task141 {
    public static void loop(int x, int y) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        while (x * 2 < y) {
            if (y % 2 == 0) {
                y = y / 2;
            } else {
                y = y - 1;
            }
            q.append(y).append(" ");
            count++;
        }
        if (q.length() > 1) {
            q.deleteCharAt(q.length() - 1);
            System.out.println("Числа: " + q + ", Количество: " + count);
        } else {
            System.out.println("Числа: 0, Количество: 0");
        }
    }
}
