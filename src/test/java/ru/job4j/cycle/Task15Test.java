package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task15Test {
    @Test
    public void whenMinus5And104Then104And103And102And101And100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.loop(-5, 104);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("104 103 102 101 100").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when6And101Then101And100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.loop(6, 101);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("101 100").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenMinus16And80ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.loop(-16, 80);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when110And115Then115And114And113And112And111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.loop(110, 115);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("115 114 113 112 111").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }
}