package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task63Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1110001Then4Yes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 1, 1, 0, 0, 0, 1};
        Task63.loop(rsl);
        String expected = "4, Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0000001Then1No() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 0, 0, 0, 0, 0, 1};
        Task63.loop(rsl);
        String expected = "1, Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when111000Then3No() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 1, 1, 0, 0, 0};
        Task63.loop(rsl);
        String expected = "3, Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}