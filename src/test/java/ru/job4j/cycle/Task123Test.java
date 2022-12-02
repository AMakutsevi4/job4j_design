package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task123Test {
    public String ln = System.lineSeparator();

    @Test
    public void when545Then14And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(545);
        String expected = "14 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when550Then10And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(550);
        String expected = "10 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when500Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(500);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5245Then16And7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(5245);
        String expected = "16 7" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12345Then15And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(12345);
        String expected = "15 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task123.loop(6);
        String expected = "";
        assertThat(out.toString(), is(expected));
    }
}