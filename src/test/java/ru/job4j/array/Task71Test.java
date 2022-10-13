package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task71Test {
    @Test
    public void when52603Then563And20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 2, 6, 0, 3};
        Task71.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5 6 3").add("2 0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345Then135And24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 3, 4, 5};
        Task71.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 3 5").add("2 4");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12121Then111And22() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 1, 2, 1};
        Task71.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 1 1").add("2 2");
        assertThat(out.toString(), is(expected.toString()));
    }
}