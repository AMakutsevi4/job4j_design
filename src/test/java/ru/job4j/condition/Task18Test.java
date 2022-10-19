package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task18Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(10);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(0);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus10ThenMinus10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(-10);
        String expected = "-10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when99Then99() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(99);
        String expected = "99" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(100);
        String expected = "99" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9999Then9998() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(9999);
        String expected = "9998" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when999999Then999998() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(999999);
        String expected = "999998" + ln;
        assertThat(out.toString(), is(expected));
    }
}