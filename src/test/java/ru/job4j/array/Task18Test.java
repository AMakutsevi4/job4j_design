package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task18Test {
    @Test
    public void when1And2And3Then3210() {
        int rsl = Task18.capSum(1, 2, 3);
        int expected = 3210;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenAllZeros() {
        int rsl = Task18.capSum(0, 0, 0);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0And1And0Then100() {
        int rsl = Task18.capSum(0, 1, 0);
        int expected = 100;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when6And2And1Then1260() {
        int rsl = Task18.capSum(6, 2, 1);
        int expected = 1260;
        assertThat(rsl, is(expected));
    }
}