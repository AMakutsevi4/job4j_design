package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task105Test {
    public String ln = System.lineSeparator();

    @Test
    public void when101And303And909Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {101, 303, 909};
        Task105.loop(num);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when199And882And350Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {199, 882, 350};
        Task105.loop(num);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when505And363And404Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {505, 363, 404};
        Task105.loop(num);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}