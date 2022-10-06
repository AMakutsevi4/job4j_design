package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task59Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2And0123Then1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 1, 2, 3};
        Task59.loop(2, rsl);
        String expected = "Равно: 1, меньше: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0And0123Then1And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 1, 2, 3};
        Task59.loop(0, rsl);
        String expected = "Равно: 1, меньше: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And0123Then0And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {0, 1, 2, 3};
        Task59.loop(4, rsl);
        String expected = "Равно: 0, меньше: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And4334Then2And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {4, 3, 3, 4};
        Task59.loop(4, rsl);
        String expected = "Равно: 2, меньше: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And1Then1And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1};
        Task59.loop(1, rsl);
        String expected = "Равно: 1, меньше: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}