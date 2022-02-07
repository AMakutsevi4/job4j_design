package ru.job4j.design.lsp.car;

import java.util.ArrayList;
import java.util.List;

public class Park implements Parking {

    private final int passengerPlace;
    private final int trackPlace;
    private final List<Car> passengerStorage;
    private final List<Car> trackStorage;

    public Park(int passengerPlace, int trackPlace) {
        this.passengerPlace = passengerPlace;
        this.trackPlace = trackPlace;
        this.passengerStorage = new ArrayList<>(passengerPlace);
        this.trackStorage = new ArrayList<>(trackPlace);
    }

    @Override
    public boolean parkCar(Car car) {
        return true;
    }
}
