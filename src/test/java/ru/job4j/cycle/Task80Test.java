package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task80Test {
    public String ln = System.lineSeparator();

    @Test
    public void when34435Then3dot8And0dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {3, 4, 4, 3, 5};
        Task80.loop(grades);
        String expected = "Средняя удовл. оценка: 3.8, средняя неуд. оценка: 0.0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12221Then0dot0And1dot6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {1, 2, 2, 2, 1};
        Task80.loop(grades);
        String expected = "Средняя удовл. оценка: 0.0, средняя неуд. оценка: 1.6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12555Then5dot0And1dot5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {1, 2, 5, 5, 5};
        Task80.loop(grades);
        String expected = "Средняя удовл. оценка: 5.0, средняя неуд. оценка: 1.5" + ln;
        assertThat(out.toString(), is(expected));
    }
}