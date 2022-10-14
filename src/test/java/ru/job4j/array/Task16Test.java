package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task16Test {
    @Test
    public void when6Then5And4And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(6);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5").add("4").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when0ThenMinus1AndMinus2AndMinus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(0);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-1").add("-2").add("-3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenMinus5ThenMinus6AndMinus7AndMinus8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(-5);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-6").add("-7").add("-8");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when11Then10And9And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(11);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("10").add("9").add("8");
        assertThat(out.toString(), is(expected.toString()));
    }

}