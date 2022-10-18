package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task45Test {
    @Test
    public void when123And456Then423And156() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(123, 456);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("423").add("156");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when999And555Then599And955() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(999, 555);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("599").add("955");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when900And501Then500And901() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(900, 501);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("500").add("901");
        assertThat(out.toString(), is(expected.toString()));
    }
}