package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task51Test {
    public String ln = System.lineSeparator();

    @Test
    public void when7And2Then4And0And16And0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(7, 2);
        String expected = "4 0 16 0 36 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And7Then4And0And16And0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(2, 7);
        String expected = "4 0 16 0 36 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(1, 1);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3And3Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(3, 3);
        String expected = "9" + ln;
        assertThat(out.toString(), is(expected));
    }
}