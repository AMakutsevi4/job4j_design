package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task159Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen9240() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task159.loop();
        String expected = "9240" + ln;
        assertThat(out.toString(), is(expected));
    }
}