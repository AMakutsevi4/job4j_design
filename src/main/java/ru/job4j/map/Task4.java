package ru.job4j.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer i : left) {
            if (!right.contains(i)) {
                rsl.add(i);
            }
        }
        for (Integer i : right) {
            if (!left.contains(i)) {
                rsl.add(i);
            }
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl;
    }
}