package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task16Test {
    @Test
    public void whenTestThen1And2And3And4And5And6And7And8And9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("1 2 3 4 5 6 7 8 9").add("Финиш");
        assertThat(out.toString(), is(expected.toString()));
    }
}