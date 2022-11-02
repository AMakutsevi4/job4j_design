package ru.job4j.cycle;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        int count = 0;
           while (count++ < months) {
            sum +=  sum * percent / 100;
        }
        System.out.printf("%.2f", sum);
        System.out.println();
    }
}
