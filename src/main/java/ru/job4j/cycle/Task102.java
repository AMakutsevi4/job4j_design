package ru.job4j.cycle;

public class Task102 {
    public static void loop(int[] num) {
        int positive = 0;
        int negative = 0;
        for (int j : num) {
            if (j > 0) {
                positive++;
            }
            if (j < 0) {
                negative++;
            }
        }
        if (negative == 0) {
            System.out.println("Max: " + positive + ", min: Нет");
        }
        if (positive == 0) {
            System.out.println("Max: Нет" + ", min: -" + negative);
        }
        if (positive != 0 && negative != 0) {
            System.out.println("Max: " + positive + ", min: -" + negative);
        }
    }
}
