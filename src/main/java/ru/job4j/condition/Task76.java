package ru.job4j.condition;

import java.util.Arrays;
import java.util.HashSet;

public class Task76 {
    public static void sameNumAmount(int num) {
        String[] strings = String.valueOf(num).split("");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(strings));
        int q = strings.length - hashSet.size();
        q++;
        System.out.println(q);
    }
}
