package ru.job4j.design.lsp.car;

public class TrackCar implements Car {

    public final int size;

    public TrackCar(int size) {
        if (size <= 1) {
            System.out.println("Размер грузовика должен быть больше 1");
        }
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
