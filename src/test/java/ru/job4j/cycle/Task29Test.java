package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task29Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5Then104And113And122And131And140() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.loop(5);
        String expected = "104 113 122 131 140" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when7Then106And115And124And133And142() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.loop(7);
        String expected = "106 115 124 133 142" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.loop(1);
        String expected = "100" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2Then101And110() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.loop(2);
        String expected = "101 110" + ln;
        assertThat(out.toString(), is(expected));
    }
}