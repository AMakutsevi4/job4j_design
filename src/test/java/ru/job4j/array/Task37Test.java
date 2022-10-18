package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task37Test {
    public String ln = System.lineSeparator();

    @Test
    public void when123Then230() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(123);
        String expected = "230" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when120Then200() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(120);
        String expected = "200" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(100);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when106Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(106);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }
}