package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task118Test {
    public String ln = System.lineSeparator();

    @Test
    public void when223Then2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task118.loop(223);
        String expected = "Количество чет: 2, сумма нечет: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3346Then2And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task118.loop(3346);
        String expected = "Количество чет: 2, сумма нечет: 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when21Then1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task118.loop(21);
        String expected = "Количество чет: 1, сумма нечет: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task118.loop(5);
        String expected = "Количество чет: 0, сумма нечет: 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when22Then2And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task118.loop(22);
        String expected = "Количество чет: 2, сумма нечет: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}