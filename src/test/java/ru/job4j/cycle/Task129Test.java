package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task129Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2670Then15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task129.loop(2670);
        String expected = "15" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when360Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task129.loop(360);
        String expected = "9" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9692Then26() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task129.loop(9692);
        String expected = "26" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when14Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task129.loop(14);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task129.loop(6);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }

}