package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task45Test {
    public String ln = System.lineSeparator();

    @Test
    public void when23Then123And223And323And423() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.loop(23);
        String expected = "123 223 323 423" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when40Then140And240And340And440() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.loop(40);
        String expected = "140 240 340 440" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when99Then199And299And399And499() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.loop(99);
        String expected = "199 299 399 499" + ln;
        assertThat(out.toString(), is(expected));
    }
}