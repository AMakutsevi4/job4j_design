package ru.job4j.cycle;

public class Task58 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
