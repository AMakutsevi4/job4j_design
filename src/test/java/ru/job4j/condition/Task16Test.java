package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task16Test {
    public String ln = System.lineSeparator();

    @Test
    public void when0ThenZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(0);
        String expected = "Zero" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4ThenNotZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(4);
        String expected = "Not zero" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus4ThenNotZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(-4);
        String expected = "Not zero" + ln;
        assertThat(out.toString(), is(expected));
    }
}