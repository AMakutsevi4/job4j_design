package ru.job4j.kiss;


import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class MaxMinTest {

    @Test
    public void whenIntSearchMax() {

        List<Integer> list = List.of(1, 12, 2, 48, 56, 135, -4, 98);
        Integer expected = 135;
        Assert.assertEquals(expected, new MaxMin().max(list, Comparator.naturalOrder()));
    }

    @Test
    public void whenIntSearchMin() {

        List<Integer> list = List.of(1, 12, 2, 48, 56, 135, -4, 98);
        Integer expected = -4;
        Assert.assertEquals(expected, new MaxMin().min(list, Comparator.naturalOrder()));
    }

    @Test
    public void whenIntSearchThenListNull() {

        List<Integer> list = List.of();
        Assert.assertNull(new MaxMin().max(list, Comparator.naturalOrder()));
    }
}