package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task70Test {
    public String ln = System.lineSeparator();

    @Test
    public void when65Then1And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(65);
        String expected = "Минут: 1, секунд: 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when123Then2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(123);
        String expected = "Минут: 2, секунд: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when119Then1And59() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(119);
        String expected = "Минут: 1, секунд: 59" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when120Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(120);
        String expected = "Минут: 2, секунд: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3600Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(3600);
        String expected = "Минут: 60, секунд: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3601ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(3601);
        String expected = "Расчет не производится" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3700ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task70.secondsToMinutes(3700);
        String expected = "Расчет не производится" + ln;
        assertThat(out.toString(), is(expected));
    }

}