package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task51Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5And6ThenTrue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.fractionType(5, 6);
        String expected = "Правильная" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And7ThenTrue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.fractionType(1, 7);
        String expected = "Правильная" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6And5ThenFalse() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.fractionType(6, 5);
        String expected = "Неправильная" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9And2ThenFalse() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.fractionType(9, 2);
        String expected = "Неправильная" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3And3ThenInteger() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.fractionType(3, 3);
        String expected = "Целое число" + ln;
        assertThat(out.toString(), is(expected));
    }
}