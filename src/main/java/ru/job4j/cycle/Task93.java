package ru.job4j.cycle;

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
        System.out.println("В финале: " + count + ", сумма баллов: " + rsl);
    }
}
