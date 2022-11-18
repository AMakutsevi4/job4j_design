package ru.job4j.cycle;

public class Task159 {
    public static void loop() {
        int max = 0;
        int rsl = 0;
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > max) {
                max = sum;
                rsl = i;
            }
        }
        System.out.println(rsl);
    }
}