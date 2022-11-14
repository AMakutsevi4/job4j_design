package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task155Test {
    @Test
    public void whenTest10To20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task155.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Число: 10, сумма делителей: 8")
                .add("Число: 11, сумма делителей: 1")
                .add("Число: 12, сумма делителей: 16")
                .add("Число: 13, сумма делителей: 1")
                .add("Число: 14, сумма делителей: 10")
                .add("Число: 15, сумма делителей: 9")
                .add("Число: 16, сумма делителей: 15")
                .add("Число: 17, сумма делителей: 1")
                .add("Число: 18, сумма делителей: 21")
                .add("Число: 19, сумма делителей: 1")
                .add("Число: 20, сумма делителей: 22");
        assertThat(out.toString(), is(expected.toString()));
    }
}