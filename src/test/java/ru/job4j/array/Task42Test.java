package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task42Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234Then4123() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1234);
        String expected = "4123" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1200Then120() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1200);
        String expected = "120" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1000);
        String expected = "100" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1060Then106() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1060);
        String expected = "106" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1006Then6100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1006);
        String expected = "6100" + ln;
        assertThat(out.toString(), is(expected));
    }
}