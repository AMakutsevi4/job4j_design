package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task79Test {
    public String ln = System.lineSeparator();

    @Test
    public void when34235Then3dot4And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {3, 4, 2, 3, 5};
        Task79.loop(grades);
        String expected = "Средняя оценка: 3.4, неуд. оценка: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12425Then2dot8And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {1, 2, 4, 2, 5};
        Task79.loop(grades);
        String expected = "Средняя оценка: 2.8, неуд. оценка: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12345Then3dot0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {1, 2, 3, 4, 5};
        Task79.loop(grades);
        String expected = "Средняя оценка: 3.0, неуд. оценка: 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}