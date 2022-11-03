package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task135Test {
    public String ln = System.lineSeparator();

    @Test
    public void when3752Then2573() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task135.loop(3752);
        String expected = "2573" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when357Then753() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task135.loop(357);
        String expected = "753" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when350Then53() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task135.loop(350);
        String expected = "53" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25Then52() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task135.loop(25);
        String expected = "52" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task135.loop(5);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }
}