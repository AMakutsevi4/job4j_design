package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task31Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5Then10And11And12And13And14And20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.loop(5);
        String expected = "10 11 12 13 14 20" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3Then10And11And12And20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.loop(3);
        String expected = "10 11 12 20" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then10And20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.loop(1);
        String expected = "10 20" + ln;
        assertThat(out.toString(), is(expected));
    }
}