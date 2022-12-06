package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task69Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10And12ThenRectangle() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.squareOrRectangle(10, 12);
        String expected = "Прямоугольник" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And6ThenRectangle() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.squareOrRectangle(2, 6);
        String expected = "Прямоугольник" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when8And4ThenRectangle() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.squareOrRectangle(8, 4);
        String expected = "Прямоугольник" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4And4ThenSquare() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.squareOrRectangle(4, 4);
        String expected = "Квадрат" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when16And16ThenSquare() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.squareOrRectangle(16, 16);
        String expected = "Квадрат" + ln;
        assertThat(out.toString(), is(expected));
    }
}