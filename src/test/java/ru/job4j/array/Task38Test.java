package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task38Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234Then2340() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1234);
        String expected = "2340" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1200Then2000() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1200);
        String expected = "2000" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1000);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1060Then600() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1060);
        String expected = "600" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1006Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1006);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }
}