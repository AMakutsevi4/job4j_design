package ru.job4j.map;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        List<Integer> rsl = new ArrayList<>(left);
        rsl.retainAll(right);
        return rsl;
    }
}
