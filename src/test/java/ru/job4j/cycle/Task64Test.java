package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task64Test {
    public String ln = System.lineSeparator();

    @Test
    public void when159923And11Then2203() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 5, 9, 9, 2, 3, 11};
        Task64.loop(rsl);
        String expected = "Зимой: 2, Весной: 2, Летом: 0, Осенью: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when123456789And10And11And12Then3333() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Task64.loop(rsl);
        String expected = "Зимой: 3, Весной: 3, Летом: 3, Осенью: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when123Then2100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 2, 3};
        Task64.loop(rsl);
        String expected = "Зимой: 2, Весной: 1, Летом: 0, Осенью: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when117777And10Then2041() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {1, 1, 7, 7, 7, 7, 10};
        Task64.loop(rsl);
        String expected = "Зимой: 2, Весной: 0, Летом: 4, Осенью: 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}