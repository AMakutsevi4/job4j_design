package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task43Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen312And315And318And321And324() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.loop();
        String expected = "312 315 318 321 324" + ln;
        assertThat(out.toString(), is(expected));
    }
}