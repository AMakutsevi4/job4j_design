package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task69Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5AndMinus2And6And0Then0And6AndMinus2And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, -2, 6, 0};
        Task69.array(arr);
        String expected = "0 6 -2 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000And9AndMinus10AndMinus6ThenMinus6AndMinus10And9And1000() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1000, 9, -10, -6};
        Task69.array(arr);
        String expected = "-6 -10 9 1000" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And22And222AndMinus2222ThenMinus2222And222And22And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 22, 222, -2222};
        Task69.array(arr);
        String expected = "-2222 222 22 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}