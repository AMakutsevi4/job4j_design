package ru.job4j.collection.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<E> implements List<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;
    private int modCount;

    private static class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void add(E value) {
        Node<E> first = new Node<>(value, null);
        Node<E> last = this.last;
        if (last == null || size == 0) {
            this.first = first;
        } else {
            this.last.next = first;
        }
        this.last = first;
        size++;
        modCount++;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        Node<E> rsl = first;
        for (int i = 0; i < index; i++) {
            rsl = rsl.next;
        }
        return rsl.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> itNode = first;
            private final int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return itNode != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E rsl = itNode.element;
                itNode = itNode.next;
                return rsl;
            }
        };
    }
}