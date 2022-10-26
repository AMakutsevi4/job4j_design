package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task77Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen30And60And90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};
        int[] third = {10, 20, 30};
        Task77.array(first, second, third);
        String expected = "Первый: 30, второй: 60, третий: 90" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenTestThen40And80And70() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {20, 30, 10};
        int[] second = {10, 20, 30};
        int[] third = {10, 30, 30};
        Task77.array(first, second, third);
        String expected = "Первый: 40, второй: 80, третий: 70" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenTestThen50And60And80() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {30, 10, 20};
        int[] second = {10, 20, 30};
        int[] third = {10, 30, 30};
        Task77.array(first, second, third);
        String expected = "Первый: 50, второй: 60, третий: 80" + ln;
        assertThat(out.toString(), is(expected));
    }
}