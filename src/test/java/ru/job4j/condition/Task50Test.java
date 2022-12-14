package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task50Test {
    public String ln = System.lineSeparator();

    @Test
    public void when373And26Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(373, 26);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5And21Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(5, 21);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20And200ThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(20, 200);
        String expected = "Одинаковые" + ln;
        assertThat(out.toString(), is(expected));
    }
}