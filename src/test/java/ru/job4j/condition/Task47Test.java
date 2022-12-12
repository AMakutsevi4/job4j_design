package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task47Test {
    public String ln = System.lineSeparator();

    @Test
    public void when474Then447() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(474);
        String expected = "447" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when591Then195() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(591);
        String expected = "195" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(100);
        String expected = "100" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when590Then95() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(590);
        String expected = "95" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when500Then500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(500);
        String expected = "500" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when600Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(600);
        String expected = "6" + ln;
        assertThat(out.toString(), is(expected));
    }
}