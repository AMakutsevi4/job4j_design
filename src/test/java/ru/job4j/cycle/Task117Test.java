package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task117Test {
    public String ln = System.lineSeparator();

    @Test
    public void when223Then2And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task117.loop(223);
        String expected = "Количество: 2, сумма: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3346Then2And10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task117.loop(3346);
        String expected = "Количество: 2, сумма: 10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when21Then1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task117.loop(21);
        String expected = "Количество: 1, сумма: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task117.loop(5);
        String expected = "Количество: 0, сумма: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}