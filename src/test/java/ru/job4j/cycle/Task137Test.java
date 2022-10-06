package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task137Test {
    public String ln = System.lineSeparator();

    @Test
    public void when9Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task137.loop(9);
        String expected = "18" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task137.loop(3);
        String expected = "12" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when16Then79() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task137.loop(16);
        String expected = "79" + ln;
        assertThat(out.toString(), is(expected));
    }
}