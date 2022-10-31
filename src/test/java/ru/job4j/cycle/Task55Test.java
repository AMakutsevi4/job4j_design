package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task55Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And2And3Then1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 2, 3};
        Task55.loop(rsl);
        String expected = "Четных: 1, нечетных: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And3AndMinus4Then2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {2, 3, -4};
        Task55.loop(rsl);
        String expected = "Четных: 2, нечетных: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0And2AndMinus4Then3And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 2, -4};
        Task55.loop(rsl);
        String expected = "Четных: 3, нечетных: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1And1And3Then0And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {-1, 1, 3};
        Task55.loop(rsl);
        String expected = "Четных: 0, нечетных: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

}