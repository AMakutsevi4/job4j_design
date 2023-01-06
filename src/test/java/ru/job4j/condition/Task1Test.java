package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Task1Test {
    @Test
    public void when3ElThenFound() {
        String[] strings = {"стол", "стул", "столица"};
        String expected = "ст";
        assertThat(Task1.maxMatch(strings), is(expected));
    }

    @Test
    public void when4ElThenFound() {
        String[] strings = {"столовая", "стол", "столица", "столяр"};
        String expected = "стол";
        assertThat(Task1.maxMatch(strings), is(expected));
    }

    @Test
    public void when1ElThenFound() {
        String[] strings = {"столовая"};
        String expected = "столовая";
        assertThat(Task1.maxMatch(strings), is(expected));
    }

    @Test
    public void when3ElThenNotFound() {
        String[] strings = {"столовая", "стол", "апостол"};
        String expected = "";
        assertThat(Task1.maxMatch(strings), is(expected));
    }

    @Test
    public void whenEmptyThenNotFound() {
        String[] strings = {};
        String expected = "";
        assertThat(Task1.maxMatch(strings), is(expected));
    }
}