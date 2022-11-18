package ru.job4j.cycle;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            int rsl = num % 10;
            if (rsl % 2 == 0) {
                sum += num % 10;
                count++;
            }
            num = num / 10;

        }
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }
}
