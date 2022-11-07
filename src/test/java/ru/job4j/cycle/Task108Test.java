package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task108Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenMinus5And2And40And999And19ThenMinus5And2And40And37() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-5, 2, 40, 999, 19};
        Task108.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-5").add("2").add("40").add("Сумма: 37");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when999And2And40And0And19Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {999, 2, 40, 0, 19};
        Task108.loop(num);
        String expected = "Сумма: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus7And5And999And10And39ThenMinus7And5AndMinus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-7, 5, 999, 10, 39};
        Task108.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-7").add("5").add("Сумма: -2");
        assertThat(out.toString(), is(expected.toString()));
    }
}