package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task116Test {
    public String ln = System.lineSeparator();

    @Test
    public void when222Then3And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task116.loop(222);
        String expected = "Количество: 3, сумма: 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3346Then4And16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task116.loop(3346);
        String expected = "Количество: 4, сумма: 16" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when21Then2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task116.loop(21);
        String expected = "Количество: 2, сумма: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then1And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task116.loop(5);
        String expected = "Количество: 1, сумма: 5" + ln;
        assertThat(out.toString(), is(expected));
    }
}