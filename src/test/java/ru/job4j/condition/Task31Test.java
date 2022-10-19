package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task31Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And2Then1221() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(1, 2);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 2").add("2 1");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when2And1Then1221() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(2, 1);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 2").add("2 1");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenMinus2And1ThenMinus211Minus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(-2, 1);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-2 1").add("1 -2");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when1And0Then0110() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(1, 0);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("0 1").add("1 0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when0AndMinus1ThenMinus100Minus1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(0, -1);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-1 0").add("0 -1");
        assertThat(out.toString(), is(expected.toString()));
    }
}