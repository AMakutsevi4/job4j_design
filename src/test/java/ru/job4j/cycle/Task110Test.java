package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task110Test {
    public String ln = System.lineSeparator();

    @Test
    public void when30And40And50And60And70Then120And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {30, 40, 50, 60, 70};
        Task110.loop(nums);
        String expected = "Сумма: 120, количество: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when150And200And250Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {150, 200, 250};
        Task110.loop(nums);
        String expected = "Сумма: 0, количество: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100And200And300Then100And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {100, 200, 300};
        Task110.loop(nums);
        String expected = "Сумма: 100, количество: 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}