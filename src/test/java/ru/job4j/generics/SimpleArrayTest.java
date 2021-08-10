package ru.job4j.generics;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SimpleArrayTest {
    @Test
    public void whenAddModel() {
        SimpleArray<String> array = new SimpleArray<>();
        array.add("first");
        String rsl = array.get(0);
        assertThat(rsl, is("first"));
    }

    @Test
    public void whenSetModel() {
        SimpleArray<String> array = new SimpleArray<>();
        array.add("one");
        array.add("Two");
        array.set(1, "three");
        String rsl = "three";
        assertThat(rsl, is("three"));
    }
    @Test
    public void whenRemoveModel() {
        SimpleArray<String> array = new SimpleArray<>();
        array.add("one");
        array.add("two");
        array.add("three");
        array.add("four");
        array.remove(2);
        String rsl = array.get(2);
        assertThat(rsl, is("four"));
    }
}
