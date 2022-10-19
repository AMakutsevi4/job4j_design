package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task21Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenPositiveSameThenSame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(1, 2);
        String expected = "Одинаковые" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenNegativeSameThenSame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(-1, -2);
        String expected = "Одинаковые" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenDifferentThenDifferent1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(-1, 2);
        String expected = "Разные" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenDifferentThenDifferent2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(1, -2);
        String expected = "Разные" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenFirstZeroThenIncorrect() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(0, -2);
        String expected = "Некорректно" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenSecondZeroThenIncorrect() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(1, 0);
        String expected = "Некорректно" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenBothZeroThenIncorrect() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(0, 0);
        String expected = "Некорректно" + ln;
        assertThat(out.toString(), is(expected));
    }
}