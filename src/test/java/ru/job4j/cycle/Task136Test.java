package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task136Test {
    public String ln = System.lineSeparator();

    @Test
    public void when16ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task136.loop(16);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task136.loop(9);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task136.loop(5);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when7ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task136.loop(7);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}