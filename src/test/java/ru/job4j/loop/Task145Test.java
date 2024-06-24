package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task145Test {
    public String ln = System.lineSeparator();

    @Test
    public void when9And1dot7Then3dot0And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task145.loop(9, 1.7);
        String expected = "Промежуточные: 3.0, Количество: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when81And1dot6Then9dot0And3dot0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task145.loop(81, 1.6);
        String expected = "Промежуточные: 9.0 3.0, Количество: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when625And1dot1Then25dot0And5dot0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task145.loop(625, 1.3);
        String expected = "Промежуточные: 25.0 5.0, Количество: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when625And1dot1Then25dot0And5dot0And2dot2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task145.loop(625, 1.1);
        String expected = "Промежуточные: 25.0 5.0 2.2, Количество: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

}