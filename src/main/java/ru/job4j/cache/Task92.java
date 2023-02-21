package ru.job4j.cache;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        StringJoiner joiner = new StringJoiner(" ");
        int rsl = (a2 - a1) / (n2 - n1);
        for (int i = a1 + rsl; i < a2; i += rsl) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(n2 - n1 == 1 ? "Нет чисел" : joiner);
    }
}
