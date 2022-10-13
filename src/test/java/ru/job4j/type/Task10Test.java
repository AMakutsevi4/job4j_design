package ru.job4j.type;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task10Test {

    @Test
    public void whenF90ThenC32dot2() {
        ByteArrayInputStream in = new ByteArrayInputStream("90".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "32,2";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenF10ThenCMinus12dot2() {
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "-12,2";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenFMinus123ThenCMinus86dot1() {
        ByteArrayInputStream in = new ByteArrayInputStream("-123".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "-86,1";
        assertThat(out.toString(), is(expected));
    }

}