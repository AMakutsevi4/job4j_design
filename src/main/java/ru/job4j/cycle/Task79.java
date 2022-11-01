package ru.job4j.cycle;

import java.util.Arrays;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad = 0;
        for (int q : grades) {
            if (q <= 2) {
                bad++;
            }
        }
        avg = Arrays.stream(grades).average().getAsDouble();
        System.out.println("Средняя оценка: " + avg + ", неуд. оценка: " + bad);
    }
}