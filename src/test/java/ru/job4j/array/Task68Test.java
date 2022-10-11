package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task68Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5AndMinus2And6And0Then5AndMinus2And6And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, -2, 6, 0};
        Task68.array(arr);
        String expected = "5 -2 6 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000And9AndMinus10AndMinus6Then1000And9AndMinus10AndMinus6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1000, 9, -10, -6};
        Task68.array(arr);
        String expected = "1000 9 -10 -6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And22And222AndMinus2222Then2And22And222AndMinus2222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 22, 222, -2222};
        Task68.array(arr);
        String expected = "2 22 222 -2222" + ln;
        assertThat(out.toString(), is(expected));
    }
}