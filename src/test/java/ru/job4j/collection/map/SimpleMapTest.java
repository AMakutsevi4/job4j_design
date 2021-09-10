package ru.job4j.collection.map;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleMapTest {
    @Test
    public void whenInsertThenGet() {
        SimpleMap<Integer, Integer> table = new SimpleMap<>();
        table.put(1, 1);
        table.put(2, 2);
        table.put(3, 3);
        table.put(4, 4);
        assertThat(table.get(1), is(1));
        assertThat(table.get(2), is(2));
        assertThat(table.get(3), is(3));
        assertThat(table.get(4), is(4));
    }

    @Test
    public void whenInsertThenGetEmpty() {
        SimpleMap<Integer, Integer> table = new SimpleMap<>();
        table.put(1, 1);
        table.put(3, 3);
        assertThat(table.get(1), is(1));
        assertNull(table.get(2));
    }

    @Test
    public void whenInsertThenDelete() {
        SimpleMap<Integer, Integer> table = new SimpleMap<>();
        table.put(1, 1);
        table.put(3, 3);
        assertThat(table.get(1), is(1));
        assertTrue(table.remove(1));
        assertNull(table.get(1));
    }

    @Test
    public void whenDelete() {
        SimpleMap<Integer, Integer> table = new SimpleMap<>();
        assertFalse(table.remove(0));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenKeysIteratorConcurrentModification() {
        Map<Integer, String> map = new SimpleMap<>();
        map.put(1, "one");
        Iterator<Integer> it = map.iterator();
        map.put(2, "two");
        it.next();
    }
}
