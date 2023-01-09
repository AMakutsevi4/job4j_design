package ru.job4j.condition;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int index = 0;
        int[] array = new int[nums.length];
        for (int i : nums) {
            while (i != 0) {
                array[index] += i % 10;
                i /= 10;
            }
            joiner.add(String.valueOf(array[index]));
            index++;
        }
        int rsl = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[rsl]) {
                rsl = i;
            }
        }
        System.out.printf("Суммы: %s, индекс: %d%n", joiner, rsl);
    }
}
