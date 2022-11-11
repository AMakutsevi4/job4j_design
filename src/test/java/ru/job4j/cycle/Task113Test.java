package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task113Test {
    public String ln = System.lineSeparator();

    @Test
    public void when23446And12345Then9And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {2, 3, 4, 4, 6};
        int[] second = {1, 2, 3, 4, 5};
        Task113.loop(first, second);
        String expected = "Сумма1: 9, сумма2: 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when13446And12345Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {1, 3, 4, 4, 6};
        int[] second = {1, 2, 3, 4, 5};
        Task113.loop(first, second);
        String expected = "Сумма1: 0, сумма2: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when32446And12345Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {3, 2, 4, 4, 6};
        int[] second = {1, 2, 3, 4, 5};
        Task113.loop(first, second);
        String expected = "Сумма1: 3, сумма2: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when34215And12345Then10And10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {3, 4, 2, 1, 5};
        int[] second = {1, 2, 3, 4, 5};
        Task113.loop(first, second);
        String expected = "Сумма1: 10, сумма2: 10" + ln;
        assertThat(out.toString(), is(expected));
    }
}