package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task124Test {
    public String ln = System.lineSeparator();

    @Test
    public void when4And351And250And29And93Then4And9And7And11And12And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {4, 351, 250, 29, 93};
        Task124.loop(nums);
        String expected = "Суммы: 4 9 7 11 12, индекс: 4" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when16And10And361Then7And1And10And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {16, 10, 361};
        Task124.loop(nums);
        String expected = "Суммы: 7 1 10, индекс: 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when19And22Then10And4And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {19, 22};
        Task124.loop(nums);
        String expected = "Суммы: 10 4, индекс: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}