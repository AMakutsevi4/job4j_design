package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task148Test {
    public String ln = System.lineSeparator();

    @Test
    public void when10And10And5214And5532Then2And10And7And0And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] cNum = {5, 2, 1, 4};
        int[] aNum = {5, 5, 3, 2};
        Task148.loop(10, 10, cNum, aNum);
        String expected = "Группы: 2, Взрослых: 10, детей: 7, осталось билетов взр: 0, осталось билетов дет: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10And10And22142And22212Then4And7And9And3And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] cNum = {2, 2, 1, 4, 2};
        int[] aNum = {2, 2, 2, 1, 2};
        Task148.loop(10, 10, cNum, aNum);
        String expected = "Группы: 4, Взрослых: 7, детей: 9, осталось билетов взр: 3, осталось билетов дет: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when10And10And10And2And10And3Then1And10And10And0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] cNum = {10, 2};
        int[] aNum = {10, 3};
        Task148.loop(10, 10, cNum, aNum);
        String expected = "Группы: 1, Взрослых: 10, детей: 10, осталось билетов взр: 0, осталось билетов дет: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}