package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task17Test {
    public String ln = System.lineSeparator();

    @Test
    public void when0ThenZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(0);
        String expected = "Ноль" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1ThenNegative() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(-1);
        String expected = "Отрицательное" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1ThenPositive() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(1);
        String expected = "Положительное" + ln;
        assertThat(out.toString(), is(expected));
    }
}