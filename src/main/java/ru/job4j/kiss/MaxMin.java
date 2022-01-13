package ru.job4j.kiss;

import java.util.*;

public class MaxMin {

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return release(value, comparator, true);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {

        return release(value, comparator, false);
    }

    private <T> T release(List<T> value, Comparator<T> comparator, boolean findMax) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        var data = value.iterator();
        var rsl = data.next();
        while (data.hasNext()) {
            var next = data.next();
            if (findMax) {
                if (comparator.compare(next, rsl) > 0) {
                    rsl = next;
                }
            }
            if (!findMax) {
                if (comparator.compare(next, rsl) < 0) {
                    rsl = next;
                }
            }
        }
        return rsl;
    }
}