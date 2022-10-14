package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task23Test {
    public String ln = System.lineSeparator();

    @Test
    public void when205Then5And0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(205);
        String expected = "5 0 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when778Then8And7And7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(778);
        String expected = "8 7 7" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when165Then5And6And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(165);
        String expected = "5 6 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}