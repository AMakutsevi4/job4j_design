package ru.job4j.cycle;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task87Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen27() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task87.loop();
        String expected = "27" + ln;
        assertThat(out.toString(), is(expected));
    }
}