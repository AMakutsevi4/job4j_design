package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task141Test {
    public String ln = System.lineSeparator();

    @Test
    public void when3And27Then26And13And12And6And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task141.loop(3, 27);
        String expected = "Числа: 26 13 12 6, Количество: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And9Then8And4And2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task141.loop(1, 9);
        String expected = "Числа: 8 4 2, Количество: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And15Then14And7And6And3And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task141.loop(2, 15);
        String expected = "Числа: 14 7 6 3, Количество: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And3Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task141.loop(2, 3);
        String expected = "Числа: 0, Количество: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And5Then4And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task141.loop(2, 5);
        String expected = "Числа: 4, Количество: 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}