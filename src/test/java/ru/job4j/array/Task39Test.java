package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task39Test {
    public String ln = System.lineSeparator();

    @Test
    public void when123Then231() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(123);
        String expected = "231" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when120Then201() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(120);
        String expected = "201" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(100);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when106Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(106);
        String expected = "61" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(111);
        String expected = "111" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when121Then211() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(121);
        String expected = "211" + ln;
        assertThat(out.toString(), is(expected));
    }
}