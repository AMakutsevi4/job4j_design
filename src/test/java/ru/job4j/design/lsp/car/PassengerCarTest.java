package ru.job4j.design.lsp.car;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerCarTest {

    @Test
    public void whenTrueSize() {
        assertEquals(1, new PassengerCar().getSize());
    }

    @Ignore
    @Test
    public void whenFalseSize() {
        assertEquals(2, new PassengerCar().getSize());
    }
}