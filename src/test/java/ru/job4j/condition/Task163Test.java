package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task163Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen10And11And12And13And14And15And17And19And20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task163.loop();
        String expected = "10 11 12 13 14 15 17 19 20" + ln;
        assertThat(out.toString(), is(expected));
    }
}