package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task26Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2Then0AndMinus8AndMinus16AndMinus24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.loop(2);
        String expected = "0 -8 -16 -24" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then0AndMinus8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.loop(1);
        String expected = "0 -8" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3Then0AndMinus8AndMinus16AndMinus24AndMinus32AndMinus40() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.loop(3);
        String expected = "0 -8 -16 -24 -32 -40" + ln;
        assertThat(out.toString(), is(expected));
    }
}