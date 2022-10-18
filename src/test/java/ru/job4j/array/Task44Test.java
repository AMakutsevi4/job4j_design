package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task44Test {
    @Test
    public void when123And4567Then127And4563() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(123, 4567);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("127").add("4563");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when555And7777Then557And7775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(555, 7777);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("557").add("7775");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345And67Then12347And65() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(12345, 67);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("12347").add("65");
        assertThat(out.toString(), is(expected.toString()));
    }
}