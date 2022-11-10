package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task94Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2422262627And7774787174ThenYesYesNoYesNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] diameter = {24, 22, 26, 26, 27};
        int[] weight = {77, 74, 78, 71, 74};
        Task94.loop(diameter, weight);
        String expected = "Да, Да, Нет, Да, Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2828282828And7774787474ThenNoNoNoNoNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] diameter = {28, 28, 28, 28, 28};
        int[] weight = {77, 74, 78, 74, 74};
        Task94.loop(diameter, weight);
        String expected = "Нет, Нет, Нет, Нет, Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2422262627And8074788074ThenNoYesNoNoNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] diameter = {24, 22, 26, 26, 27};
        int[] weight = {80, 71, 78, 80, 74};
        Task94.loop(diameter, weight);
        String expected = "Нет, Да, Нет, Нет, Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}