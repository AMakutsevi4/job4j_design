package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task28Test {
    public String ln = System.lineSeparator();

    @Test
    public void when6Then15And24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.loop(6);
        String expected = "15 24" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when8Then17And26() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.loop(8);
        String expected = "17 26" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.loop(1);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }
}