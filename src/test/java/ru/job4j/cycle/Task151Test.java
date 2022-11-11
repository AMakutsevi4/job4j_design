package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task151Test {

    @Test
    public void whenTestThenMultiplicationTable() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task151.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1 2 3 4 5 6 7 8 9").add("2 4 6 8 10 12 14 16 18")
                .add("3 6 9 12 15 18 21 24 27").add("4 8 12 16 20 24 28 32 36")
                .add("5 10 15 20 25 30 35 40 45").add("6 12 18 24 30 36 42 48 54")
                .add("7 14 21 28 35 42 49 56 63").add("8 16 24 32 40 48 56 64 72")
                .add("9 18 27 36 45 54 63 72 81");
        assertThat(out.toString(), is(expected.toString()));
    }
}