package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task20Test {
    public String ln = System.lineSeparator();

    @Test
    public void when20Then2And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(20);
        String expected = "2 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when36Then3And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(36);
        String expected = "3 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11Then1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(11);
        String expected = "1 1" + ln;
        assertThat(out.toString(), is(expected));
    }

}