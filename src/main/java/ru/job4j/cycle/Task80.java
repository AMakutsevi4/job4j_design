package ru.job4j.cycle;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg;
        double badAvg;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int q : grades) {
            if (q <= 2 && q != 0) {
                bad++;
                sumBad += q;
            }
            if (q > 2) {
                good++;
                sumGood += q;
            }
        }
        if (bad == 0 && good != 0) {
            goodAvg = (double) sumGood / good;
            System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + 0.0);
        }
        if (good == 0 && bad != 0) {
            badAvg = (double) sumBad / bad;
            System.out.println("Средняя удовл. оценка: " + 0.0 + ", средняя неуд. оценка: " + badAvg);
        }
        if (bad != 0 && good != 0) {
            goodAvg = (double) sumGood / good;
            badAvg = (double) sumBad / bad;
            System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
        }
    }
}

