package ru.job4j.design.lsp.car;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackCarTest {

    @Test
    public void whenTrueSize() {
        assertEquals(2, new TrackCar(2).getSize());
        assertEquals(3, new TrackCar(3).getSize());
        assertEquals(4, new TrackCar(4).getSize());
    }

    @Ignore
    @Test
    public void whenFalseSize() {
        assertEquals(1, new TrackCar(2).getSize());
        assertEquals(1, new TrackCar(3).getSize());
        assertEquals(0, new TrackCar(4).getSize());
    }

}