package ru.job4j.collection.map;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleMap<K, V> implements Map<K, V> {

    private static final float LOAD_FACTOR = 0.75f;

    private int capacity = 8;

    private int count = 0;

    private int modCount = 0;

    private MapEntry<K, V>[] table = new MapEntry[capacity];

    @Override
    public boolean put(K key, V value) {
        expand();
        if (table[indexFor(hash(key.hashCode()))] == null) {
            table[indexFor(hash(key.hashCode()))] = new MapEntry<>(key, value);
            count++;
            modCount++;
            return true;
        }
        return false;
    }

    private int hash(int hashCode) {
        return hashCode ^ (hashCode >>> 16);
    }

    private int indexFor(int hash) {
        return hash % capacity;
    }

    private int indexOr(K key) {
        int q = key == null ? 0 : hash(key.hashCode());
        return indexFor(q);
    }

    private void expand() {
        float size = (float) count / (float) table.length;
        if (size >= LOAD_FACTOR) {
            capacity = capacity * 2;
            MapEntry<K, V>[] twoTable = new MapEntry[capacity];
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    twoTable[indexFor(hash(table[i].key.hashCode()))] = table[i];
                }
            }
            table = twoTable;
        }
    }

    @Override
    public V get(K key) {
        int index = indexOr(key);
        if (table[index] == null || !table[index].getKey().equals(key)) {
            return null;
        }
        return table[index].getValue();
    }


    @Override
    public boolean remove(K key) {
        int index = indexOr(key);
        boolean result = table[index] != null && key.equals(table[index].key);
        if (result) {
            table[index] = null;
            modCount++;
            count--;
        }
        return result;
    }


    @Override
    public Iterator<K> iterator() {

        class MapIterator implements Iterator {
            int iterCount = 0;
            final int expectedModCount = modCount;

            public boolean hasNext() {
                while (iterCount < table.length) {
                    if (table[iterCount] == null) {
                        iterCount++;
                        continue;
                    }
                    return true;
                }
                return false;
            }

            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }

                return table[iterCount++];
            }
        }
        return new MapIterator();
    }

    private static class MapEntry<K, V> {

        K key;
        V value;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}