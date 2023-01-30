package ru.job4j.condition;


public class Task149 {
    public static void loop(int[] grades) {
        int count = 0;
        double avg = 0.0;
        for (int x : grades) {
            if (x > 0 && x < 6) {
                avg += x;
                count++;
            } else {
                break;
            }
        }
         System.out.printf("%.2f", avg / count);
        System.out.println();
    }
}