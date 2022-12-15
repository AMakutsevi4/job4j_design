package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task55Test {
    @Test
    public void when12Then4And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(12);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when1Then1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(1);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("1");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when10Then4And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(10);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4").add("1");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when8Then3And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(8);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("3").add("2");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when21Then7And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(21);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("7").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when2Then1And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(2);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("2");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when3Then1And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task55.apartmentPlace(3);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }
}