package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task83Test {
    @Test
    public void when4Then7dot61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(4);
        String expected = "7,61";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6Then13dot93() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(6);
        String expected = "13,93";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2Then2dot73() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(2);
        String expected = "2,73";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when7Then17dot54() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(7);
        String expected = "17,54";
        assertThat(out.toString(), is(expected));
    }

}