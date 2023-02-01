package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task83Test {
    @Test
    public void when123And4Then02() {
        int[] arr = {1, 2, 3};
        int goal = 4;
        int[] expected = {0, 2};
        assertThat(Task83.sumOfTwo(arr, goal), is(expected));
    }

    @Test
    public void when1279And9Then12() {
        int[] arr = {1, 2, 7, 9};
        int goal = 9;
        int[] expected = {1, 2};
        assertThat(Task83.sumOfTwo(arr, goal), is(expected));
    }

    @Test
    public void when1234And7Then23() {
        int[] arr = {1, 2, 3, 4};
        int goal = 7;
        int[] expected = {2, 3};
        assertThat(Task83.sumOfTwo(arr, goal), is(expected));
    }

    @Test
    public void when123And6ThenNull() {
        int[] arr = {1, 2, 3};
        int goal = 6;
        assertNull(Task83.sumOfTwo(arr, goal));
    }

    @Test
    public void when3And3ThenNull() {
        int[] arr = {3};
        int goal = 3;
        assertNull(Task83.sumOfTwo(arr, goal));
    }

    @Test
    public void whenEmptyAnd4ThenNull() {
        int[] arr = {};
        int goal = 4;
        assertNull(Task83.sumOfTwo(arr, goal));
    }
}