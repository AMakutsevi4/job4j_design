package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task82Test {
    @Test
    public void whenJohnAndJohnThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertTrue(Task82.isEquals("John", "John"));
    }

    @Test
    public void whenJohnAndJimThenNotEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertFalse(Task82.isEquals("John", "Jim"));
    }
}