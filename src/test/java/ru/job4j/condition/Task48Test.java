package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task48Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2And2dot5And3Then5dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(2, 2.5, 3);
        String expected = "5.0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And1dot5And5Then6dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(4, 1.5, 5);
        String expected = "6.0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3And3dot5And4Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(3, 3.5, 4);
        String expected = "7" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And4dot5And5Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(1, 4.5, 5);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }
}