package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task121Test {
    public String ln = System.lineSeparator();

    @Test
    public void when20And321And452And58And5Then2And6And11And13And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {20, 321, 452, 58, 5};
        Task121.loop(nums);
        String expected = "2 6 11 13 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10And20And31Then1And2And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {10, 20, 31};
        Task121.loop(nums);
        String expected = "1 2 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10And201And3152Then1And3And11() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {10, 201, 3152};
        Task121.loop(nums);
        String expected = "1 3 11" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {6};
        Task121.loop(nums);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }
}