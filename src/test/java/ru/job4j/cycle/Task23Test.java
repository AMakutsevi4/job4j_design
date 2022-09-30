package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task23Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10Then11And12And13And14And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.loop(10);
        String expected = "11 12 13 14 15" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25Then26And27And28And39And30() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.loop(25);
        String expected = "26 27 28 29 30" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then2And3And4And5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.loop(1);
        String expected = "2 3 4 5 6" + ln;
        assertThat(out.toString(), is(expected));
    }
}