package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task38Test {
    public String ln = System.lineSeparator();

    @Test
    public void when37Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(37);
        String expected = "7" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when40Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(40);
        String expected = "4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when55ThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(55);
        String expected = "Равны" + ln;
        assertThat(out.toString(), is(expected));
    }
}