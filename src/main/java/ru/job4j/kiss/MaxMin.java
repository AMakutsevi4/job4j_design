package ru.job4j.kiss;

import java.util.*;
import java.util.function.Predicate;

public class MaxMin {

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return release(value, comparator, integer -> integer < 0);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {

        return release(value, comparator, integer -> integer > 0);
    }

    private <T> T release(List<T> value, Comparator<T> comparator, Predicate<Integer> predicate) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        var rsl = value.get(0);
        for (var temp : value) {
            if (predicate.test(comparator.compare(rsl, temp))) {
                rsl = temp;
            }
        }
        return rsl;
    }
}