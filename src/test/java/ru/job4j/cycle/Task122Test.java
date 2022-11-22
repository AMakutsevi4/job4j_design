package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task122Test {
    public String ln = System.lineSeparator();

    @Test
    public void when11And222And36And23And10Then11And222And36() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {11, 222, 36, 23, 10};
        Task122.loop(nums);
        String expected = "11 222 36" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when41And55And32ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {41, 55, 32};
        Task122.loop(nums);
        String expected = "";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when40And41And42Then40() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {40, 41, 42};
        Task122.loop(nums);
        String expected = "40" + ln;
        assertThat(out.toString(), is(expected));
    }
}