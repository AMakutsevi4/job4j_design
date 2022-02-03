package ru.job4j.design.lsp.car;

public class Park implements Parking {

    @Override
    public boolean parkCar(Car car) {
        return false;
    }
}
