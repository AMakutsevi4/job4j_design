package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task65Test {
    public String ln = System.lineSeparator();

    @Test
    public void when12ThenWinter() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(12);
        String expected = "Зима" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1ThenWinter() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(1);
        String expected = "Зима" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2ThenWinter() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(2);
        String expected = "Зима" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3ThenSpring() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(3);
        String expected = "Весна" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4ThenSpring() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(4);
        String expected = "Весна" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5ThenSpring() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(5);
        String expected = "Весна" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6ThenSummer() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(6);
        String expected = "Лето" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when7ThenSummer() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(7);
        String expected = "Лето" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when8ThenSummer() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(8);
        String expected = "Лето" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9ThenFall() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(9);
        String expected = "Осень" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10ThenFall() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(10);
        String expected = "Осень" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11ThenFall() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(11);
        String expected = "Осень" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when13ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(13);
        String expected = "Не является месяцем" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(0);
        String expected = "Не является месяцем" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus6ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(-6);
        String expected = "Не является месяцем" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when23ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task65.season(23);
        String expected = "Не является месяцем" + ln;
        assertThat(out.toString(), is(expected));
    }
}