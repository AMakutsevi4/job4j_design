package ru.job4j.cycle;

public class Task119 {
    public static void loop(int num, int digit) {
        int index = 0;
        int test = 0;
        int[] rsl = new int[String.valueOf(num).length()];
        while (num > 0) {
            rsl[index++] = num % 10;
            num = num / 10;
        }
        for (int q : rsl) {
            if (q == digit) {
                test++;
            }
        }
        System.out.println(test > 0 ? "Да" : "Нет");
    }
}