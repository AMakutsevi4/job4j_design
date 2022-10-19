package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task19Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10And9Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(10, 9);
        String expected = "19" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9And10Then90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(9, 10);
        String expected = "90" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus9AndMinus10ThenMinus19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(-9, -10);
        String expected = "-19" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus10AndMinus9Then90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(-10, -9);
        String expected = "90" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And0Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(1, 0);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0And1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(0, 1);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5And5ThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(5, 5);
        String expected = "Числа равны" + ln;
        assertThat(out.toString(), is(expected));
    }
}