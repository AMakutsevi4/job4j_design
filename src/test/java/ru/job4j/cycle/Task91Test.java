package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task91Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2And4And6Then8And10And12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task91.loop(2, 4, 6);
        String expected = "8 10 12" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3And6And9Then12And15And18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task91.loop(3, 6, 9);
        String expected = "12 15 18" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And2And3Then4And5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task91.loop(1, 2, 3);
        String expected = "4 5 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And4And8ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task91.loop(2, 4, 8);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And5And10ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task91.loop(1, 5, 10);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}