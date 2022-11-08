package ru.job4j.cycle;

public class Task90 {
    public static void loop() {
        StringBuilder q = new StringBuilder();
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            int one = i / 10;
            int two = i % 10;
            if (2 * (one + two) == one * two) {
                count++;
                q.append(i).append(" ");
                sum += i;
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println("Числа: " + q + ", Количество: " + count + ", Сумма: " + sum);
    }
}