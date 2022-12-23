package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task132Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2134680Then213468() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {2, 1, 3, 4, 6, 8, 0};
        Task132.loop(nums);
        String expected = "2 1 3 4 6 8" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when22222Then2222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {2, 2, 2, 2, 2};
        Task132.loop(nums);
        String expected = "2 2 2 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when135725226Then13572522() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 3, 5, 7, 2, 5, 2, 2, 6};
        Task132.loop(nums);
        String expected = "1 3 5 7 2 5 2 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}