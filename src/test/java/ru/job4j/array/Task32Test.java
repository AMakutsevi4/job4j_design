package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task32Test {
    public String ln = System.lineSeparator();

    @Test
    public void when36Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(36);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when64Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(64);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when35Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(35);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when67Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(67);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when50Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(50);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}