package ru.job4j.type;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task12Test {
    @Test
    public void when1InchThen2dot54CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "2,54";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25InchesThen63dot5CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("25".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "63,50";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when96InchesThen243dot84CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("96".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "243,84";
        assertThat(out.toString(), is(expected));
    }
}