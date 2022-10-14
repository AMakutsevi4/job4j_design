package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class Task14Test {
    @Test
    public void whenA3B4C5ThenPerimeter12Area6() {
        ByteArrayInputStream in = new ByteArrayInputStream("3 4 5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("12,0").add("6,0");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenA3B4C5ThenPerimeter12Area62() {
        ByteArrayInputStream in = new ByteArrayInputStream("2,4 8,5 8,8".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("19,7").add("10,2");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void whenA5B7C8dot6ThenPerimeter20dot6Area17dot5() {
        ByteArrayInputStream in = new ByteArrayInputStream("5 7 8,6".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("20,6").add("17,5");
        assertThat(out.toString(), is(expected.toString()));
    }
}