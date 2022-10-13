package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task73Test {
    @Test
    public void when52603Then53And20And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 2, 6, 0, 3};
        Task73.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 3").add("2 0").add("6");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345Then15And24And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 3, 4, 5};
        Task73.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 5").add("2 4").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when5432Then52And43() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 4, 3, 2};
        Task73.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 2").add("4 3");
        assertThat(out.toString(), is(expected.toString()));
    }
}