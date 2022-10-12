package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task79Test {
    public String ln = System.lineSeparator();

    @Test
    public void when554331Then5And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 5, 4, 3, 3, 1};
        Task79.array(arr);
        String expected = "5 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when54331Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 4, 3, 3, 1};
        Task79.array(arr);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when153ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 5, 3};
        Task79.array(arr);
        String expected = "";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenEmptyThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {};
        Task79.array(arr);
        String expected = "";
        assertThat(out.toString(), is(expected));
    }
}