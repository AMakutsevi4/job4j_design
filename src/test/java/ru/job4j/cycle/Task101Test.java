package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task101Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10AndMinus6And23And0AndMinus4Then23AndMinus6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {10, -6, 23, 0, -4};
        Task101.loop(num);
        String expected = "Max: 23, min: -6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20AndMinus10And6And5AndMinus4Then20AndMinus10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {20, -10, 6, 5, -4};
        Task101.loop(num);
        String expected = "Max: 20, min: -10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5And3And1And0And2Then5And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {5, 3, 1, 0, 2};
        Task101.loop(num);
        String expected = "Max: 5, min: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}