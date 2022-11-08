package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task97Test {
    public String ln = System.lineSeparator();

    @Test
    public void when21And23And27And19And22Then19And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {21, 23, 27, 19, 22};
        Task97.loop(num);
        String expected = "Время: 19, номер: 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when35And34And37And36And38Then34And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {35, 34, 37, 36, 38};
        Task97.loop(num);
        String expected = "Время: 34, номер: 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when20And22And24And26And18Then18And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {20, 22, 24, 26, 18};
        Task97.loop(num);
        String expected = "Время: 18, номер: 4" + ln;
        assertThat(out.toString(), is(expected));
    }
}