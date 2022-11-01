package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task82Test {
    public String ln = System.lineSeparator();

    @Test
    public void when21A10A2A2And1A2A5A22Then65And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] promo = {21, 10, 2, 2};
        int[] concert = {1, 2, 5, 22};
        Task82.loop(promo, concert);
        String expected = "Продано билетов: 65, выдано бесплатно: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1234And1234Then20And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] promo = {1, 2, 3, 4};
        int[] concert = {1, 2, 3, 4};
        Task82.loop(promo, concert);
        String expected = "Продано билетов: 20, выдано бесплатно: 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when31And1Then32And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] promo = {31};
        int[] concert = {1};
        Task82.loop(promo, concert);
        String expected = "Продано билетов: 32, выдано бесплатно: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And10Then11And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] promo = {1};
        int[] concert = {10};
        Task82.loop(promo, concert);
        String expected = "Продано билетов: 11, выдано бесплатно: 0" + ln;
        assertThat(out.toString(), is(expected));
    }
}