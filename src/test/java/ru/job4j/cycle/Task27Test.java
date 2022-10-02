package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task27Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2ThenMinus1And0And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.loop(2);
        String expected = "-1 0 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.loop(1);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3ThenMinus2AndMinus1And0And1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.loop(3);
        String expected = "-2 -1 0 1 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}