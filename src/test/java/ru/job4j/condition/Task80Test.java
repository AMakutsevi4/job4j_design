package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task80Test {

    @Test
    public void whenAAndAThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertTrue(Task80.isIdentical('A', 'A'));
    }

    @Test
    public void whenAAndBThenNotEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertFalse(Task80.isIdentical('A', 'B'));
    }
}