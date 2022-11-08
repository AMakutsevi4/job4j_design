package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task98Test {
    public String ln = System.lineSeparator();

    @Test
    public void when4And1And2And9And6Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {4, 1, 2, 9, 6};
        Task98.loop(num);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10And8And5And4And2Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {10, 8, 5, 4, 2};
        Task98.loop(num);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And2And3And4And5Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {1, 2, 3, 4, 5};
        Task98.loop(num);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }
}