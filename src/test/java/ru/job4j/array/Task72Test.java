package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task72Test {
    public String ln = System.lineSeparator();

    @Test
    public void when52603Then260And53() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 2, 6, 0, 3};
        Task72.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2 6 0").add("5 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345Then24And135() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 3, 4, 5};
        Task72.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2 4").add("1 3 5");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when2468Then2468() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 4, 6, 8};
        Task72.array(arr);
        String expected = "2 4 6 8" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1357Then1357() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 3, 5, 7};
        Task72.array(arr);
        String expected = "1 3 5 7" + ln;
        assertThat(out.toString(), is(expected));
    }
}