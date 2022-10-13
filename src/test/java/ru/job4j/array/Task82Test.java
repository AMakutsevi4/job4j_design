package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task82Test {
    @Test
    public void when5AndMinus5AndMinus4And0And3And1Then9AndMinus9And1() {
        int[] arr = {5, -5, -4, 0, 3, 1};
        int[] expected = {9, -9, 1};
        assertThat(Task82.array(arr), is(expected));
    }

    @Test
    public void when5And4And3And3AndMinus1Then15AndMinus1And0() {
        int[] arr = {5, 4, 3, 3, -1};
        int[] expected = {15, -1, 0};
        assertThat(Task82.array(arr), is(expected));
    }

    @Test
    public void when1And5And3Then9And0And0() {
        int[] arr = {1, 5, 3};
        int[] expected = {9, 0, 0};
        assertThat(Task82.array(arr), is(expected));
    }
}