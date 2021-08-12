package ru.job4j.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {
    private final Object[] arrays = new Object[10];
    private int size = 0;


    public void add(T model) {
        arrays[size] = model;
        size++;
    }

    public void set(int index, T model) {
        Objects.checkIndex(index, size);
        arrays[index] = model;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(arrays, index + 1, arrays, index, size - index - 1);
        arrays[arrays.length - 1] = null;
        size--;
    }

    public T get(int index) {
        return (T) arrays[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int nextElement;
            @Override
            public boolean hasNext() {
                return nextElement < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) arrays[size++];
            }
        };
    }
}
