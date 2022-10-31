package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task54Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And2And3Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 2, 3};
        Task54.loop(rsl);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1AndMinus2And3Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, -2, 3};
        Task54.loop(rsl);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1AndMinus2AndMinus3Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, -2, -3};
        Task54.loop(rsl);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1AndMinus2AndMinus3Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {-1, -2, -3};
        Task54.loop(rsl);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1And0And1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {-1, 0, 1};
        Task54.loop(rsl);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}