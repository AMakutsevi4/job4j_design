package ru.job4j.collection;

import java.util.*;

public class SimpleArray<T> implements Iterable<T> {
    private int modCount;
    private int size;
    private int pointer;
    T[] arrays = (T[]) new Object[size];

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) arrays[index];
    }

    public void add(T model) {
        if (size == arrays.length) {
            arrays = Arrays.copyOf(arrays, arrays.length + 1);
        }
        arrays[size++] = model;
        modCount++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return pointer < arrays.length;
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