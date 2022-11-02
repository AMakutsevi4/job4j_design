package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task85Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10000And5And2Then11025() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task85.loop(10000, 5, 2);
        String expected = "11025,00" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000And10And3Then1331() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task85.loop(1000, 10, 3);
        String expected = "1331,00" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10000And10And2Then12100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task85.loop(10000, 10, 2);
        String expected = "12100,00" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100And5And2Then110dot25() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task85.loop(100, 5, 2);
        String expected = "110,25" + ln;
        assertThat(out.toString(), is(expected));
    }
}