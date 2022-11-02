package ru.job4j.cycle;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int[] e = new int[num];
        int rsl = 0;
        int sumFib;
        for (int i = 0; i < e.length - 1; i++) {
            e[i] = a1;
            e[i + 1] = a2;
            sumFib = a1 + a2;
            a1 = a2;
            a2 = sumFib;
        }
        for (int u : e) {
            rsl += u;
        }
        System.out.println(rsl);
    }
}