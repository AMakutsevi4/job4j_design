package ru.job4j.design.lsp.car;

public class PassengerCar implements Car {
    @Override
    public int getSize() {
        return 1;
    }
}
