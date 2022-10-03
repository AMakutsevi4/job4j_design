package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task34Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5Then7And9And11And13And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.loop(5);
        String expected = "7 9 11 13 15" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9Then11And13And15And17And19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.loop(9);
        String expected = "11 13 15 17 19" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20Then21And23And25And27And29() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.loop(20);
        String expected = "21 23 25 27 29" + ln;
        assertThat(out.toString(), is(expected));
    }
}