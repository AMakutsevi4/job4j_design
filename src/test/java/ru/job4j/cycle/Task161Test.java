package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task161Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen11And13And17And19And23And29() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task161.loop();
        String expected = "11 13 17 19 23 29" + ln;
        assertThat(out.toString(), is(expected));
    }
}