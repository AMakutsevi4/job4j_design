package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {
    private final int[] arrays;
    private int point = 0;

    public EvenIterator(int[] arrays) {
        this.arrays = arrays;
    }

    @Override
    public boolean hasNext() {
        while (point < arrays.length && arrays[point] % 2 != 0) {
            point++;
        }
        return point < arrays.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();

        }
        return arrays[point++];
    }
}
