package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task21Test {
    public String ln = System.lineSeparator();

    @Test
    public void when205Then2And0And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(205);
        String expected = "2 0 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when361Then3And6And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(361);
        String expected = "3 6 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when116Then1And1And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(116);
        String expected = "1 1 6" + ln;
        assertThat(out.toString(), is(expected));
    }
}