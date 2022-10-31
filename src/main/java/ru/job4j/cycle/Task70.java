package ru.job4j.cycle;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 0; i < coords.length - 1; i += 2) {
            int l = (int) Math.sqrt(Math.pow(Math.abs(x - coords[i]), 2) + Math.pow(Math.abs(y - coords[i + 1]), 2));
            if (l < r) {
                on++;
            }
            if (l == r) {
                in++;
            }
        }
        System.out.println("На окружности: " + in + ", внутри: " + on);
    }
}
