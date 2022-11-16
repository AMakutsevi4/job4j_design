package ru.job4j.cycle;

public class Task89 {
    public static void loop() {
        int count = 0;
        StringBuilder q = new StringBuilder();
        for (int i = 99; i <= 999; i++) {
            int one = (i / 100) * (i / 100) * (i / 100);
            int two = (i % 100 / 10) * (i % 100 / 10) * (i % 100 / 10);
            int three = (i % 10) * (i % 10) * (i % 10);
            int r = one + two + three;
            if (r == i) {
                q.append(i).append(" ");
                count++;
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println("Числа: " + q + ", Количество: " + count);
    }
}
