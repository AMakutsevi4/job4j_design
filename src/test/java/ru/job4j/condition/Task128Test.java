package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task128Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2670Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task128.loop(2670);
        String expected = "4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when360Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task128.loop(360);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9692Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task128.loop(9692);
        String expected = "4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when14Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task128.loop(14);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task128.loop(5);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}