package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task60Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2And2And3Then1stAnd2ndEqualsAnd3rdMore() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(2, 2, 3);
        String expected = "Первое и второе равны, третье больше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And3And2Then1stAnd3rdEqualsAnd2ndMore() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(2, 3, 2);
        String expected = "Первое и третье равны, второе больше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3And2And2Then2ndAnd3rdEqualsAnd1stMore() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(3, 2, 2);
        String expected = "Второе и третье равны, первое больше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And2And1Then1stAnd2ndEqualsAnd3rdLess() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(2, 2, 1);
        String expected = "Первое и второе равны, третье меньше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And1And2Then1stAnd3rdEqualsAnd2ndLess() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(2, 1, 2);
        String expected = "Первое и третье равны, второе меньше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And2And2Then2ndAnd3rdEqualsAnd1stLess() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(1, 2, 2);
        String expected = "Второе и третье равны, первое меньше" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2And2And2ThenAllEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(2, 2, 2);
        String expected = "Все равны" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And2And3ThenNoEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.numRelation(1, 2, 3);
        String expected = "Равных нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}