package ru.job4j.collection;

import java.util.*;

public class SimpleArray<T> implements Iterable<T> {
    private int modCount;
    private int size;

    T[] arrays = (T[]) new Object[10];

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) arrays[index];
    }

    public void add(T model) {
        if (size == arrays.length) {
            arrays = Arrays.copyOf(arrays, arrays.length * 2);
            arrays[arrays.length - 1] = null;
        }
        arrays[size++] = model;
        modCount++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int expectedModCount = modCount;
            int pointer;

            @Override
            public boolean hasNext() {
                return pointer < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return (T) arrays[pointer++];
            }
        };
    }
}