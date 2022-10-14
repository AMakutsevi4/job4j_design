package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task35Test {
    public String ln = System.lineSeparator();

    @Test
    public void when364Then463() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(364);
        String expected = "463" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when121Then121() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(121);
        String expected = "121" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(100);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when650Then56() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(650);
        String expected = "56" + ln;
        assertThat(out.toString(), is(expected));
    }
}