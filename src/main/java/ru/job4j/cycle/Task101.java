package ru.job4j.cycle;

public class Task101 {
    public static void loop(int[] num) {
        int positive = 0;
        int negative = 0;
        for (int j : num) {
            if (j > 0 && positive < j) {
                positive = j;
            }
            if (j < 0 && negative > j) {
                negative = j;
            }
        }
        System.out.println("Max: " + positive + ", min: " + negative);
    }
}
