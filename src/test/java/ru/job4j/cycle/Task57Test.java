package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task57Test {
    public String ln = System.lineSeparator();

    @Test
    public void when0And1And1And2Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 1, 1, 2};
        Task57.loop(rsl);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And3And2And1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {4, 3, 2, 1};
        Task57.loop(rsl);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1And0And1And2Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {-1, 0, 1, 2};
        Task57.loop(rsl);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1AndMinus2AndMinus3And0Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {-1, -2, -3, 0};
        Task57.loop(rsl);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}