package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task76Test {
    public String ln = System.lineSeparator();

    @Test
    public void when554331Then21201() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 5, 4, 3, 3, 1};
        Task76.array(arr);
        String expected = "5: 2, 4: 1, 3: 2, 2: 0, 1: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then10000() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5};
        Task76.array(arr);
        String expected = "5: 1, 4: 0, 3: 0, 2: 0, 1: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12345Then11111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 3, 4, 5};
        Task76.array(arr);
        String expected = "5: 1, 4: 1, 3: 1, 2: 1, 1: 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}