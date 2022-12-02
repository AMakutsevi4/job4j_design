package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task33Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(1);
        String expected = "Ошибка" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(0);
        String expected = "Ошибка" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(-1);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus4Then16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(-4);
        String expected = "16" + ln;
        assertThat(out.toString(), is(expected));
    }
}