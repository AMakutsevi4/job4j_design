package ru.job4j.cycle;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int one = 0;
        int two = 0;
        for (int r : tickets) {
            if (num >= r) {
                num = num - r;
                one++;
                continue;
            }
            if (num < r && num > 0) {
                two++;
            }
        }
        System.out.println("Покупатели: " + one + ", отказано: " + two);
    }
}