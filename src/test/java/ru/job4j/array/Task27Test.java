package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task27Test {
    public String ln = System.lineSeparator();

    @Test
    public void when327Then703() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(327);
        String expected = "703" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when560Then45() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(560);
        String expected = "45" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100ThenMinus19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(100);
        String expected = "-19" + ln;
        assertThat(out.toString(), is(expected));
    }
}