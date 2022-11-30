package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task71Test {
    public String ln = System.lineSeparator();

    @Test
    public void when100Then1And0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(100);
        String expected = "100: 1, 50: 0, 10: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when110Then1And0And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(110);
        String expected = "100: 1, 50: 0, 10: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when170Then1And1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(170);
        String expected = "100: 1, 50: 1, 10: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when260Then2And1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(260);
        String expected = "100: 2, 50: 1, 10: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when50Then0And1And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(50);
        String expected = "100: 0, 50: 1, 10: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when90Then0And1And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(90);
        String expected = "100: 0, 50: 1, 10: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20Then0And0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(20);
        String expected = "100: 0, 50: 0, 10: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(25);
        String expected = "Нельзя" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when71ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(71);
        String expected = "Нельзя" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when259ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.change(259);
        String expected = "Нельзя" + ln;
        assertThat(out.toString(), is(expected));
    }
}