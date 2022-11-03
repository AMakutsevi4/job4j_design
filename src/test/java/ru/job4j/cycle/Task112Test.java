package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task112Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10And12345Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 4, 5};
        Task112.loop(10, nums);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12And12345Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 4, 5};
        Task112.loop(12, nums);
        String expected = "4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And56789Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {5, 6, 7, 8, 9};
        Task112.loop(4, nums);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }
}