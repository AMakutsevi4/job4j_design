package ru.job4j.design.lsp.car;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkTest  {

    @Test
    public void whenThereParkingSpaceThenTrue() {
        Park park = new Park(2, 2);
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new TrackCar(2)));
    }

    @Test
    public void whenThereParkingSpaceFullTrackThenTrue() {
        Park park = new Park(2, 2);
        assertTrue(park.parkCar(new TrackCar(2)));
        assertTrue(park.parkCar(new TrackCar(2)));
    }

    @Test
    public void whenThereParkingSpaceFullPassengerThenTrue() {
        Park park = new Park(2, 2);
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
    }
}