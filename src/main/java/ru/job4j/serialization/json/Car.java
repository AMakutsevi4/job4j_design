package ru.job4j.serialization.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Car {
    private final String brand;
    private final Engine engine;
    private final boolean addOptions;
    private final int yearsWarranty;
    private final String[] production;

    public Car(String brand, Engine engine, boolean addOptions, int yearsWarranty, String... production) {
        this.brand = brand;
        this.engine = engine;
        this.addOptions = addOptions;
        this.yearsWarranty = yearsWarranty;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", engine=" + engine
                + ", addOptions=" + addOptions
                + ", yearsWarranty=" + yearsWarranty
                + ", production=" + Arrays.toString(production)
                + '}';
    }

    public static void main(String[] args) {
        final Car car = new Car("yokko", new Engine("500"),
                true, 5, "Rus", "USA", "Ind");

        /* Преобразуем объект person в json-строку. */
        final Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(car));

        /* Модифицируем json-строку */
        final String carJson = "{"
                + "\"brand\":yokko,"
                + "\"engine\":"
                + "{"
                + "\"power\":\"500\""
                + "},"
                + "\"addOptions\":true,"
                + "\"yearsWarranty\":5,"
                + "\"production\":"
                + "[\"Rus\",\"USA\", \"Ind\"]"
                + "}";

        final Car carMod = gson.fromJson(carJson, Car.class);
        System.out.println(carMod);
    }
}