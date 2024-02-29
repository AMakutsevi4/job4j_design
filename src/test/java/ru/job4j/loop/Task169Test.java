package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task169Test {
    @Test
    public void whenHourglassWidthEquals5() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task169.main(null);
        String expected =
                "*****" + System.lineSeparator()
                        + " ***" + System.lineSeparator()
                        + "  *" + System.lineSeparator()
                        + " ***" + System.lineSeparator()
                        + "*****" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenHourglassWidthEquals7() {
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task169.main(null);
        String expected =
                "*******" + System.lineSeparator()
                        + " *****" + System.lineSeparator()
                        + "  ***" + System.lineSeparator()
                        + "   *" + System.lineSeparator()
                        + "  ***" + System.lineSeparator()
                        + " *****" + System.lineSeparator()
                        + "*******" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenHourglassWidthEquals9() {
        ByteArrayInputStream in = new ByteArrayInputStream("9".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task169.main(null);
        String expected =
                "*********" + System.lineSeparator()
                        + " *******" + System.lineSeparator()
                        + "  *****" + System.lineSeparator()
                        + "   ***" + System.lineSeparator()
                        + "    *" + System.lineSeparator()
                        + "   ***" + System.lineSeparator()
                        + "  *****" + System.lineSeparator()
                        + " *******" + System.lineSeparator()
                        + "*********" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}