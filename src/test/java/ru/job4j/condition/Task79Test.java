package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task79Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1501Then16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1501);
        String expected = "16" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1600Then16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1600);
        String expected = "16" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1601Then17() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1601);
        String expected = "17" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1700Then17() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1700);
        String expected = "17" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1701Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1701);
        String expected = "18" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1800Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1800);
        String expected = "18" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1801Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1801);
        String expected = "19" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1900Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1900);
        String expected = "19" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1901Then20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1901);
        String expected = "20" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2000Then20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(2000);
        String expected = "20" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2022ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(2022);
        String expected = "Не попадает в диапазон" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1440ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task79.getCentury(1440);
        String expected = "Не попадает в диапазон" + ln;
        assertThat(out.toString(), is(expected));
    }

}