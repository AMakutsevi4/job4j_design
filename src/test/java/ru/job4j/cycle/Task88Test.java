package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task88Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen15And24And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task88.loop();
        String expected = "Числа: 15 24, Количество: 2" + ln;
        assertThat(out.toString(), is(expected));
    }
}