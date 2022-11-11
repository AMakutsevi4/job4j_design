package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task140Test {
    public String ln = System.lineSeparator();

    @Test
    public void when16Then8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task140.loop(16);
        String expected = "8" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when7Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task140.loop(7);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task140.loop(25);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when60Then30() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task140.loop(60);
        String expected = "30" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when33Then11() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task140.loop(33);
        String expected = "11" + ln;
        assertThat(out.toString(), is(expected));
    }
}