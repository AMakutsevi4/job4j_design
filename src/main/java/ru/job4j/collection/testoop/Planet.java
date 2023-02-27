package ru.job4j.collection.testoop;

import java.util.Objects;

public class Planet {

    private String name;
    private int radius;
    private int appeal;

    public Planet() {
    }

    public Planet(String name, int radius, int appeal) {
        this.name = name;
        this.radius = radius;
        this.appeal = appeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Planet planet = (Planet) o;
        return radius == planet.radius && appeal == planet.appeal && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, appeal);
    }

    @Override
    public String toString() {
        return "Planet{"
                + "name='" + name + '\''
                + ", radius=" + radius
                + ", appeal=" + appeal
                + '}';
    }

    public String behavior(String name, int radius, int appeal) {
        return "Скорость вращения планеты " + name + " вокруг своей оси " + radius / appeal + " км/ч";
    }

    public String behavior1(Planet planet) {
        return "Скорость вращения планеты " + planet.getName() + " вокруг своей оси " + planet.getRadius() / planet.getAppeal() + " км/ч";
    }

    public static void main(String[] args) {
        Planet planetOne = new Planet();
        Planet planetTwo = new Planet("Земля", 40070, 24);

        System.out.println(planetOne.behavior("Земля", 40070, 24));
        System.out.println(planetTwo.behavior1(planetTwo));

    }


}
