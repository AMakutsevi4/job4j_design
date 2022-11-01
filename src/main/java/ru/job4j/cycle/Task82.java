package ru.job4j.cycle;

public class Task82 {
    public static void loop(int[] promo, int[] ticket) {
        int q = 0;
        int w = 0;
        for (int e : promo) {
            q += e;
        }
        for (int e : ticket) {
            w += e;
        }
        int r = q + w;
        if (q > 10) {
            System.out.println("Продано билетов: " + r + ", выдано бесплатно: " + q / 10);
        }
        if (q <= 10) {
            System.out.println("Продано билетов: " + r + ", выдано бесплатно: " + 0);
        }
    }
}