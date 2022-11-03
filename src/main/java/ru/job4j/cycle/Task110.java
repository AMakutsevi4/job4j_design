package ru.job4j.cycle;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int test = 0;
        int count = 0;
        for (int r : nums) {
            test += r;
            if (test < 150) {
                sum += r;
                count++;
            }
        }
        System.out.println("Сумма: " + sum + ", количество: " + count);
    }
}
