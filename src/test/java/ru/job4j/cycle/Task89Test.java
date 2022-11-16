package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task89Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen153And370And371And407And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task89.loop();
        String expected = "Числа: 153 370 371 407, Количество: 4" + ln;
        assertThat(out.toString(), is(expected));
    }
}