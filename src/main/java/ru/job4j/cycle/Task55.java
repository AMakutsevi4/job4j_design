package ru.job4j.cycle;

public class Task55 {
    public static void loop(int[] array) {
        int even = 0;
        int odd = 0;
        for (int q : array) {
            var i = q % 2 == 0 ? even++ : odd++;
        }
        System.out.println("Четных: " + even + ", нечетных: " + odd);
    }
}
