package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task138Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task138.loop();
        String expected = "90" + ln;
        assertThat(out.toString(), is(expected));
    }
}