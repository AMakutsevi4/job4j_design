package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task32Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen47And37And27And17() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.loop();
        String expected = "47 37 27 17" + ln;
        assertThat(out.toString(), is(expected));
    }
}