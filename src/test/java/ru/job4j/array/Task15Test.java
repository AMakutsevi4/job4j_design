package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task15Test {
    @Test
    public void when6Then8And10And12() {
        String expected = "8, 10, 12";
        assertThat(Task15.increaseBy2(6), is(expected));
    }

    @Test
    public void when3Then5And7And9() {
        String expected = "5, 7, 9";
        assertThat(Task15.increaseBy2(3), is(expected));
    }

    @Test
    public void when0Then2And4And6() {
        String expected = "2, 4, 6";
        assertThat(Task15.increaseBy2(0), is(expected));
    }

    @Test
    public void whenMinus10ThenMinus8AndMinus6AndMinus4() {
        String expected = "-8, -6, -4";
        assertThat(Task15.increaseBy2(-10), is(expected));
    }
}