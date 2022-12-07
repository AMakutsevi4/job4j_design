package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task64Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1ThenBad() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(1);
        String expected = "Плохо" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2ThenBad() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(2);
        String expected = "Плохо" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3ThenSatisfactorily() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(3);
        String expected = "Удовлетворительно" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4ThenGood() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(4);
        String expected = "Хорошо" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5ThenExcellent() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(5);
        String expected = "Отлично" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(0);
        String expected = "Не соответствует" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus6ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(-6);
        String expected = "Не соответствует" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when8ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task64.gradePrint(8);
        String expected = "Не соответствует" + ln;
        assertThat(out.toString(), is(expected));
    }
}