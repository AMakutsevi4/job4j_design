package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task17Test {
    @Test
    public void when5And4Then10dot0And18dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(5, 4);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("10,0").add("18,0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when3And3Then4dot5And12dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(3, 3);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("4,5").add("12,0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when1And7Then3dot5And16dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(1, 7);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("3,5").add("16,0");
        assertThat(out.toString(), is(expected.toString()));
    }
}