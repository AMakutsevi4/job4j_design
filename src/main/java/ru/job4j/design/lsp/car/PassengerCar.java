package ru.job4j.design.lsp.car;

public class PassengerCar implements Car {

    public final int size = 1;

    @Override
    public int getSize() {
        return size;
    }
}
