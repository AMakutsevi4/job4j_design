package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task84Test {
    public String ln = System.lineSeparator();

    @Test
    public void when0And1And5Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task84.loop(0, 1, 5);
        String expected = "7" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And3And4Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task84.loop(2, 3, 4);
        String expected = "18" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5And8And3Then() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task84.loop(5, 8, 3);
        String expected = "26" + ln;
        assertThat(out.toString(), is(expected));
    }
}