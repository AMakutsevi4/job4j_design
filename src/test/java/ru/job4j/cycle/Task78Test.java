package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task78Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234And1579Then2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] days = {1, 2, 3, 4};
        int[] values = {1, 5, 7, 9};
        Task78.loop(days, values);
        String expected = "Опасно: 2, спокойный вторник: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1225And1872Then2And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] days = {1, 2, 2, 5};
        int[] values = {1, 8, 7, 2};
        Task78.loop(days, values);
        String expected = "Опасно: 2, спокойный вторник: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1345And1254Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] days = {1, 3, 4, 5};
        int[] values = {1, 2, 5, 4};
        Task78.loop(days, values);
        String expected = "Опасно: 0, спокойный вторник: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2234And5579Then2And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] days = {2, 2, 3, 4};
        int[] values = {5, 5, 7, 9};
        Task78.loop(days, values);
        String expected = "Опасно: 2, спокойный вторник: 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}