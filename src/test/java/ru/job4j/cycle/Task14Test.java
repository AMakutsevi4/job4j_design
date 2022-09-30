package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task14Test {
    @Test
    public void whenMinus5And14Then10And11And12And13() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.loop(-5, 14);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("10 11 12 13").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when6And16Then10And11And12And13And14And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.loop(6, 16);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("10 11 12 13 14 15").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenMinus16And8ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.loop(-16, 8);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when26And30Then26And27And28And29() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.loop(26, 30);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("26 27 28 29").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }
}