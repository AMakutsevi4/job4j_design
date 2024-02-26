package ru.job4j.array;

import java.util.*;


public class Task75 {

    public static void array(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max;
        StringJoiner repeatSort = new StringJoiner(", ");
        StringJoiner often = new StringJoiner(" ");
        StringJoiner zero = new StringJoiner(" ");
        StringJoiner rarely = new StringJoiner(" ");

        for (int i = 1; i < 10; i++) {
            map.put(i, 0);
        }
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
        }
        for (Integer key : map.keySet()) {
            repeatSort.add(key.toString() + ": " + map.get(key));
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 0) {
                zero.add(key.toString());
            }
        }
        max = Collections.max(map.values());

        for (Integer key : map.keySet()) {
            if (map.get(key) >= max && map.get(key) > 1 && zero.length() < 14) {
                often.add(key.toString());
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1 && zero.length() < 13) {
                rarely.add(key.toString());
            }
        }

        if (often.length() == 0) {
            often.add("0");
        }
        if (rarely.length() == 0) {
            rarely.add("0");
        }

        System.out.println(repeatSort
                + System.lineSeparator()
                + "Чаще: " + often
                + ", отсутствует: " + zero
                + ", реже: " + rarely);
    }
}
