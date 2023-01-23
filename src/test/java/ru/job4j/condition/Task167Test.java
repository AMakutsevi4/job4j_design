package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task167Test {

    @Test
    public void when54355And24354And55545Then4dot4And3dot6And4dot8And1And4dot8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {5, 4, 3, 5, 5};
        int[] second = {2, 4, 3, 5, 4};
        int[] third = {5, 5, 5, 4, 5};
        Task167.loop(first, second, third);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Оценки: 5 4 3 5 5, средняя: 4.4")
                .add("Оценки: 2 4 3 5 4, средняя: 3.6")
                .add("Оценки: 5 5 5 4 5, средняя: 4.8")
                .add("Выше 4.5: 1, наивысшая: 4.8");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when12345And55555And33344Then3dot0And5dot0And3dot4And1And5dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {5, 5, 5, 5, 5};
        int[] third = {3, 3, 3, 4, 4};
        Task167.loop(first, second, third);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Оценки: 1 2 3 4 5, средняя: 3.0")
                .add("Оценки: 5 5 5 5 5, средняя: 5.0")
                .add("Оценки: 3 3 3 4 4, средняя: 3.4")
                .add("Выше 4.5: 1, наивысшая: 5.0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when55445And35555And33555Then4dot6And4dot6And4dot2And2And4dot6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {5, 5, 4, 4, 5};
        int[] second = {3, 5, 5, 5, 5};
        int[] third = {3, 3, 5, 5, 5};
        Task167.loop(first, second, third);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Оценки: 5 5 4 4 5, средняя: 4.6")
                .add("Оценки: 3 5 5 5 5, средняя: 4.6")
                .add("Оценки: 3 3 5 5 5, средняя: 4.2")
                .add("Выше 4.5: 2, наивысшая: 4.6");
        assertThat(out.toString(), is(expected.toString()));
    }
}