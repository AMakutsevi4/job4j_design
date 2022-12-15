package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task53Test {
    public String ln = System.lineSeparator();

    @Test
    public void when3And3Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(3, 3);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And3ThenExc() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(1, 3);
        String expected = "Подсчет не производится" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And7ThenExc() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(2, 7);
        String expected = "Подсчет не производится" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5And3Then1And2Slash3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(5, 3);
        String expected = "1 2/3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9And3Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(9, 3);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when12And7Then1And5Slash7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task53.transformFraction(12, 7);
        String expected = "1 5/7" + ln;
        assertThat(out.toString(), is(expected));
    }

}