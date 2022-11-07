package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task47Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen1405And1414And1423And1432And1441() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.loop();
        String expected = "1405 1414 1423 1432 1441" + ln;
        assertThat(out.toString(), is(expected));
    }
}