package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task43Test {
    @Test
    public void when123And456Then126And453() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(123, 456);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("126").add("453");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when100And999Then109And990() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(100, 999);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("109").add("990");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when555And777Then557And775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(555, 777);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("557").add("775");
        assertThat(out.toString(), is(expected.toString()));
    }
}