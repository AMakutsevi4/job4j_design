package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task168Test {
    @Test
    public void when10And5And212Then214And152And356And11() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task168.loop(10, 5, 212);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Цифр: 2, сумма цифр: 1, делителей: 4")
                .add("Цифр: 1, сумма цифр: 5, делителей: 2")
                .add("Цифр: 3, сумма цифр: 5, делителей: 6")
                .add("Сумма всех цифр: 11");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when100And54And213Then319And298And364And16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task168.loop(100, 54, 213);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Цифр: 3, сумма цифр: 1, делителей: 9")
                .add("Цифр: 2, сумма цифр: 9, делителей: 8")
                .add("Цифр: 3, сумма цифр: 6, делителей: 4")
                .add("Сумма всех цифр: 16");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when3And20And115Then132And226And374And12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task168.loop(3, 20, 115);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Цифр: 1, сумма цифр: 3, делителей: 2")
                .add("Цифр: 2, сумма цифр: 2, делителей: 6")
                .add("Цифр: 3, сумма цифр: 7, делителей: 4")
                .add("Сумма всех цифр: 12");
        assertThat(out.toString(), is(expected.toString()));
    }
}