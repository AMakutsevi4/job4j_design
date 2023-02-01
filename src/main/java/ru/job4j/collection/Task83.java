package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        int[] rsl = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
            if (map.containsKey(goal - numbers[i]) && (goal - numbers[i]) != numbers[i]) {
                rsl[0] = map.get(goal - numbers[i]);
                rsl[1] = map.get(numbers[i]);
            }
        }
        return rsl[0] != 0 || rsl[1] != 0 ? rsl : null;
    }
}

/**
 * int[] rsl = new int[2];
 * for (int i = 0; i < numbers.length; i++) {
 * for (int j = i + 1; j < numbers.length; j++) {
 * if (numbers[i] + numbers[j] == goal) {
 * rsl[0] = i;
 * rsl[1] = j;
 * }
 * }
 * if (rsl[0] != 0 || rsl[1] != 0) {
 * return rsl;
 * }
 * }
 * return null;
 */
