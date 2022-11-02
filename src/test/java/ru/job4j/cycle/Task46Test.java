package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task46Test {
    public String ln = System.lineSeparator();

    @Test
    public void when23Then1230And1231And1232And1233And1234And1235And1236And1237And1238And1239() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.loop(23);
        String expected = "1230 1231 1232 1233 1234 1235 1236 1237 1238 1239" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when40Then1400And1401And1402And1403And1404And1405And1406And1407And1408And1409() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.loop(40);
        String expected = "1400 1401 1402 1403 1404 1405 1406 1407 1408 1409" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11Then1110And1111And1112And1113And1114And1115And1116And1117And1118And1119() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.loop(11);
        String expected = "1110 1111 1112 1113 1114 1115 1116 1117 1118 1119" + ln;
        assertThat(out.toString(), is(expected));
    }
}