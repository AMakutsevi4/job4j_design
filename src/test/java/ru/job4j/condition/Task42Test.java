package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task42Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2222ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(2222);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2020ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(2020);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6363ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(6363);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1001ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1001);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1011ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1011);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1000);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}