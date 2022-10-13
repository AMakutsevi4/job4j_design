package ru.job4j.type;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task11Test {

    @Test
    public void when1CMThen0dot39Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "0,39";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when50CMThen19dot69Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("50".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "19,69";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when200CMThen78dot74Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("200".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "78,74";
        assertThat(out.toString(), is(expected));
    }
}