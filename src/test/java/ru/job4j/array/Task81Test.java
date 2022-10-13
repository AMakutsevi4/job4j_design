package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task81Test {
    @Test
    public void when5AndMinus5AndMinus4And0And3And1Then2And1And3() {
        int[] arr = {5, -5, -4, 0, 3, 1};
        int[] expected = {2, 1, 3};
        assertThat(Task81.array(arr), is(expected));
    }

    @Test
    public void when5And4And3And3AndMinus1Then1And0And4() {
        int[] arr = {5, 4, 3, 3, -1};
        int[] expected = {1, 0, 4};
        assertThat(Task81.array(arr), is(expected));
    }

    @Test
    public void when1And5And3Then0And0And3() {
        int[] arr = {1, 5, 3};
        int[] expected = {0, 0, 3};
        assertThat(Task81.array(arr), is(expected));
    }
}