package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task81Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenRThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.isLatin('R');
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenjThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.isLatin('j');
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenSlashThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.isLatin('/');
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenPlusThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.isLatin('+');
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

}