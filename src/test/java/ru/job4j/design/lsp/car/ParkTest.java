package ru.job4j.design.lsp.car;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkTest {

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
    public void whenThereParkingSpacePassenger2SizeTrack5ThenTrue() {
        Park park = new Park(2, 5);
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new TrackCar(5)));
    }

    @Test
    public void whenThereTrackSpaceFullThenSpacePassengerEmpty() {
        Park park = new Park(4, 2);
        assertTrue(park.parkCar(new TrackCar(4)));
        assertTrue(park.parkCar(new TrackCar(2)));
    }

    @Test
    public void when2Passenger1TruckRandomThenTrue() {
        Park park = new Park(4, 1);
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new PassengerCar()));
        assertTrue(park.parkCar(new TrackCar(9)));
        assertFalse(park.parkCar(new TrackCar(3)));
        assertTrue(park.parkCar(new TrackCar(2)));
    }

    @Test
    public void whenParkingAddTrackStoragePassengerThenFalse() {
        Park park = new Park(1, 0);
        assertFalse(park.parkCar(new TrackCar(4)));
    }

    @Test
    public void whenParkingAddPassengerStorageTrackThenFalse() {
        Park park = new Park(0, 1);
        assertFalse(park.parkCar(new PassengerCar()));
    }

    @Test
    public void whenParkingAddCarStorageEmptyThenFalse() {
        Park park = new Park(0, 0);
        assertFalse(park.parkCar(new PassengerCar()));
        assertFalse(park.parkCar(new TrackCar(7)));
    }
}