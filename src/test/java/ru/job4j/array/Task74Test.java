package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task74Test {
    @Test
    public void when52603Then52And306() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 2, 6, 0, 3};
        Task74.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 2").add("3 0 6");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345Then12And543() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 3, 4, 5};
        Task74.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 2").add("5 4 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when54321Then54And123() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 4, 3, 2, 1};
        Task74.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 4").add("1 2 3");
        assertThat(out.toString(), is(expected.toString()));
    }
}