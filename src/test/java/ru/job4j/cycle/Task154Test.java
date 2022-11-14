package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task154Test {
    @Test
    public void whenTest10To20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task154.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Число: 10, делители: 1 2 5")
                .add("Число: 11, делители: 1")
                .add("Число: 12, делители: 1 2 3 4 6")
                .add("Число: 13, делители: 1")
                .add("Число: 14, делители: 1 2 7")
                .add("Число: 15, делители: 1 3 5")
                .add("Число: 16, делители: 1 2 4 8")
                .add("Число: 17, делители: 1")
                .add("Число: 18, делители: 1 2 3 6 9")
                .add("Число: 19, делители: 1")
                .add("Число: 20, делители: 1 2 4 5 10");
        assertThat(out.toString(), is(expected.toString()));
    }
}