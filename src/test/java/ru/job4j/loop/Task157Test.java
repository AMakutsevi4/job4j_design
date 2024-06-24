package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task157Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen6And28And496And8128() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task157.loop();
        String expected = "1 6 28 496 8128" + ln;
        assertThat(out.toString(), is(expected));
    }
}