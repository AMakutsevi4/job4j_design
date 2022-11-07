package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task103Test {
    public String ln = System.lineSeparator();

    @Test
    public void when129And567And911Then911() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {129, 567, 911};
        Task103.loop(num);
        String expected = "911" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100And101And200Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {100, 101, 200};
        Task103.loop(num);
        String expected = "100" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when305And222And901Then222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {305, 222, 901};
        Task103.loop(num);
        String expected = "222" + ln;
        assertThat(out.toString(), is(expected));
    }
}