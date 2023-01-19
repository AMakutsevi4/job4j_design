package ru.job4j.condition;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int count = 0;
        int rsl = 0;
        for (int i = 0; i < 3; i++) {
            if (first[i] + second[i] >= 70) {
                count++;
                rsl += first[i] + second[i];
            }
        }
        System.out.printf("В финале: %d, сумма баллов: %d%n", count, rsl);
    }
}
