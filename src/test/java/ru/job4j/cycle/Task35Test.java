package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task35Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10Then4AndMinus2AndMinus8AndMinus14AndMinus20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.loop(10);
        String expected = "4 -2 -8 -14 -20" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when35Then29And23And17And11And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.loop(35);
        String expected = "29 23 17 11 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus6ThenMinus12AndMinus18AndMinus24AndMinus30AndMinus36() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.loop(-6);
        String expected = "-12 -18 -24 -30 -36" + ln;
        assertThat(out.toString(), is(expected));
    }
}