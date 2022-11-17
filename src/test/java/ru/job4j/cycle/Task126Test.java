package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task126Test {
    public String ln = System.lineSeparator();

    @Test
    public void when548506Then456And580() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task126.loop(548506);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4 5 6").add("5 8 0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when32133Then23And313() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task126.loop(32133);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2 3").add("3 1 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when11Then1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task126.loop(11);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("1");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when20Then0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task126.loop(20);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("2");
        assertThat(out.toString(), is(expected.toString()));
    }
}