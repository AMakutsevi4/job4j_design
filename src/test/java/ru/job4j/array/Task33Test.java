package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task33Test {
    public String ln = System.lineSeparator();

    @Test
    public void when363Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(363);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when300Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(300);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when351Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(351);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when624Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(624);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }
}