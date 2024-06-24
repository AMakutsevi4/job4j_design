package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task75Test {
    @Test
    public void when122452787Then130110210And2And369And1458() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 2, 2, 4, 5, 2, 7, 8, 7};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0")
                .add("Чаще: 2, отсутствует: 3 6 9, реже: 1 4 5 8");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when111223345Then322110000And1And6789And45() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 5};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 3, 2: 2, 3: 2, 4: 1, 5: 1, 6: 0, 7: 0, 8: 0, 9: 0")
                .add("Чаще: 1, отсутствует: 6 7 8 9, реже: 4 5");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when21Then110000000And0And3456789And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {2, 1};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 1, 2: 1, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0")
                .add("Чаще: 0, отсутствует: 3 4 5 6 7 8 9, реже: 0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when32211Then221000000And12And456789And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {3, 2, 2, 1, 1};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 2, 2: 2, 3: 1, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0")
                .add("Чаще: 1 2, отсутствует: 4 5 6 7 8 9, реже: 3");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when1Then100000000And0And23456789And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 1, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0")
                .add("Чаще: 0, отсутствует: 2 3 4 5 6 7 8 9, реже: 0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when11Then200000000And0And23456789And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1, 1};
        Task75.array(arr);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1: 2, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0")
                .add("Чаще: 0, отсутствует: 2 3 4 5 6 7 8 9, реже: 0");
        assertThat(out.toString(), is(expected.toString()));
    }
}