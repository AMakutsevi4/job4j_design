package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task22Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenPetrThenHiPetr() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Петр");
        String expected = "Привет, Петр!" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenIvanThenHiIvan() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Иван");
        String expected = "Привет, Иван!" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenElenThenHiElena() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Елена");
        String expected = "Привет, Елена!" + ln;
        assertThat(out.toString(), is(expected));
    }
}