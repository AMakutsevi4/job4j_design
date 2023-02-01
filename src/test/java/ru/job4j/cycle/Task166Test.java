package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task166Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen190And270And290() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task166.loop();
        String expected = "190 270 290" + ln;
        assertThat(out.toString(), is(expected));
    }
}