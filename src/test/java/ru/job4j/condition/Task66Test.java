package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task66Test {
    public String ln = System.lineSeparator();

    @Test
    public void when0ThenNight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(0);
        String expected = "Ночь" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when23ThenNight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(23);
        String expected = "Ночь" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5ThenNight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(5);
        String expected = "Ночь" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6ThenMorning() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(6);
        String expected = "Утро" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10ThenMorning() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(10);
        String expected = "Утро" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11ThenDay() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(11);
        String expected = "День" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when17ThenDay() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(17);
        String expected = "День" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when18ThenEvening() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(18);
        String expected = "Вечер" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when22ThenEvening() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(22);
        String expected = "Вечер" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when24ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(24);
        String expected = "Не является часом" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus6ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.daytime(-6);
        String expected = "Не является часом" + ln;
        assertThat(out.toString(), is(expected));
    }

}