package ru.job4j.cache;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BullCowTest {
    @Test
    public void whenTestThen11Rows() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BullCow.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Быков: 0, коров: 20")
                .add("Быков: 1, коров: 18")
                .add("Быков: 2, коров: 16")
                .add("Быков: 3, коров: 14")
                .add("Быков: 4, коров: 12")
                .add("Быков: 5, коров: 10")
                .add("Быков: 6, коров: 8")
                .add("Быков: 7, коров: 6")
                .add("Быков: 8, коров: 4")
                .add("Быков: 9, коров: 2")
                .add("Быков: 10, коров: 0");
        assertThat(out.toString(), is(expected.toString()));
    }
}