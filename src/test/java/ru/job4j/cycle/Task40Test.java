package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task40Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen33And36And39() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.loop();
        String expected = "33 36 39" + ln;
        assertThat(out.toString(), is(expected));
    }
}