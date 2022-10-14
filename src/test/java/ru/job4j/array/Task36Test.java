package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task36Test {
    public String ln = System.lineSeparator();

    @Test
    public void when3642Then2643() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3642);
        String expected = "2643" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1000);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1050Then51() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1050);
        String expected = "51" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1001Then1001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1001);
        String expected = "1001" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3609Then9603() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3609);
        String expected = "9603" + ln;
        assertThat(out.toString(), is(expected));
    }
}