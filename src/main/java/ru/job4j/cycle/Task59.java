package ru.job4j.cycle;

public class Task59 {
    public static void loop(int num, int[] array) {
        int count = 0;
        int n = 0;
        for (int j : array) {
            if (j == num) {
                count++;
            }
            if (j < num) {
                n++;
            }
        }
        System.out.println("Равно: " + count + "," + " меньше: " + n);
    }
}

