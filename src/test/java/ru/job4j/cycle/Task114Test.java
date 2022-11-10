package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task114Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234557Then15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 4, 5, 5, 7};
        Task114.loop(nums);
        String expected = "15" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 1};
        Task114.loop(nums);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12334Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 3, 4};
        Task114.loop(nums);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }
}