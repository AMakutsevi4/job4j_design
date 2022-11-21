package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task125Test {
    public String ln = System.lineSeparator();

    @Test
    public void when548506Then4806And55() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task125.loop(548506);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4 8 0 6").add("5 5");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when32133Then2And3133() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task125.loop(32133);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("3 1 3 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when11Then11() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task125.loop(11);
        String expected = "1 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20Then20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task125.loop(20);
        String expected = "2 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}