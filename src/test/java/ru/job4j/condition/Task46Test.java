package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task46Test {
    public String ln = System.lineSeparator();

    @Test
    public void when17And25Then18And24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(17, 25);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("18").add("24");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when512And256Then511And257() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(512, 256);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("511").add("257");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when100And100Then101And101() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(100, 100);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("101").add("101");
        assertThat(out.toString(), is(expected.toString()));
    }
}