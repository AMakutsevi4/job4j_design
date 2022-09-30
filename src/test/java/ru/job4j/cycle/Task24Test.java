package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task24Test {
    public String ln = System.lineSeparator();

    @Test
    public void when50Then40And34And28And22And16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.loop(50);
        String expected = "40 34 28 22 16" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20Then40And34And28And22And16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.loop(20);
        String expected = "10 4 -2 -8 -14" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0ThenMinus10AndMinus16AndMinus22AndMinus28AndMinus34() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.loop(0);
        String expected = "-10 -16 -22 -28 -34" + ln;
        assertThat(out.toString(), is(expected));
    }
}