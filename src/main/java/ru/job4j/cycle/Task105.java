package ru.job4j.cycle;

public class Task105 {
    public static void loop(int[] num) {
        int rsl = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = num[i] % 100 + num[i] % 100 / 10 + num[i] % 10;
            if (rsl < sum) {
                rsl = sum;
                count = i;
            }
        }
        System.out.println(count);
    }
}
