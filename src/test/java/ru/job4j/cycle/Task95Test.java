package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task95Test {
    public String ln = System.lineSeparator();

    @Test
    public void when79624And78956Then3And1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] math = {7, 9, 6, 2, 4};
        int[] info = {7, 8, 9, 5, 6};
        Task95.loop(math, info);
        String expected = "Зачислено: 3, ФМ: 1, ФИ: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when23424And78956Then0And0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] math = {2, 3, 4, 2, 4};
        int[] info = {7, 8, 9, 5, 6};
        Task95.loop(math, info);
        String expected = "Зачислено: 0, ФМ: 0, ФИ: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when99999And78994Then4And2And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] math = {9, 9, 9, 9, 9};
        int[] info = {7, 8, 9, 9, 4};
        Task95.loop(math, info);
        String expected = "Зачислено: 4, ФМ: 2, ФИ: 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}