package ru.job4j.cycle;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < first.length - 1; i++) {
            if (first[i] == second[i]) {
                break;
            }
            sum1 += first[i];
            sum2 += second[i];
        }
        System.out.println("Сумма1: " + sum1 + ", сумма2: " + sum2);
    }
}
