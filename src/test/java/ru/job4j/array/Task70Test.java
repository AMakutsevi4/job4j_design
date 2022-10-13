package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task70Test {

    @Test
    public void when52603Then526And03() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 2, 6, 0, 3};
        Task70.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 2 6").add("0 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when2003315Then2003And315() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 0, 0, 3, 3, 1, 5};
        Task70.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2 0 0 3").add("3 1 5");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when2467Then24And67() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 4, 6, 7};
        Task70.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2 4").add("6 7");
        assertThat(out.toString(), is(expected.toString()));

    }
}