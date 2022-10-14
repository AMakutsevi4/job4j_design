package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task19Test {
    @Test
    public void when5000And7000And0dot016516Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(5000, 7000, 0.016516);
        String expected = "198,19";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1500And10000And0dot02Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(1500, 10000, 0.019);
        String expected = "218,50";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when550And100And0dot01954Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(550, 100, 0.01954);
        String expected = "12,70";
        assertThat(out.toString(), is(expected));
    }
}