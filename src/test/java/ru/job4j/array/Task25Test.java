package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task25Test {
    public String ln = System.lineSeparator();

    @Test
    public void when335Then300Plus30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(335);
        String expected = "300+30+5" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when760Then700Plus60Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(760);
        String expected = "700+60+0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then100Plus0Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(100);
        String expected = "100+0+0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when109Then100Plus0Plus9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(109);
        String expected = "100+0+9" + ln;
        assertThat(out.toString(), is(expected));
    }
}