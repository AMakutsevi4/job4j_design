package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task134Test {
    public String ln = System.lineSeparator();

    @Test
    public void when33Then30() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task134.loop(33);
        String expected = "30" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25Then14() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task134.loop(25);
        String expected = "14" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task134.loop(6);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task134.loop(1);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}