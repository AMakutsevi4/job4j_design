package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task53Test {
    public String ln = System.lineSeparator();

    @Test
    public void when4Then2And4And8And16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.loop(4);
        String expected = "2 4 8 16" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2Then2And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.loop(2);
        String expected = "2 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.loop(1);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }
}