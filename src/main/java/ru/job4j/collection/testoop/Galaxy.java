package ru.job4j.collection.testoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Galaxy {

    private String name;
    private List<Planet> planetList;

    public Galaxy() {
    }

    public Galaxy(String name, List<Planet> planet) {
        this.name = name;
        this.planetList = planet;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    @Override
    public boolean equals(Object o) {
        if
        (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Galaxy galaxy = (Galaxy) o;
        return Objects.equals(name, galaxy.name) && Objects.equals(planetList, galaxy.planetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planetList);
    }

    @Override
    public String toString() {
        return "Galaxy{"
                + "name='" + name + '\''
                + ", planet=" + planetList
                + '}';
    }


    public void behavior(List<Planet> planet) {
        Planet test = new Planet();
        for (Planet p : planet) {
            System.out.println(test.behavior1(p));
        }
    }

    public void addPlanet(Planet planet) {
        if (!planetList.contains(planet)) {
            planetList.add(planet);
        } else {
            System.out.println(planet.getName() + " существует в списке");
        }
    }

    public void getPlanet(Planet planet) {
        if (planetList.contains(planet)) {
            System.out.println(planet.toString() + " Индекс " + planetList.indexOf(planet));
        } else {
            System.out.println(planet.getName() + " не существует в списке");
        }
    }

    public boolean deletePlanet(Planet planet) {
        if (!planetList.contains(planet)) {
            return false;
        } else {
            planetList.remove(planet);
        }
        return true;

    }


    public static void main(String[] args) {
        List<Planet> rsl = new ArrayList<>();

        Planet planet = new Planet("Земля", 40070, 24);
        Planet planet1 = new Planet("Меркурий", 2439, 1407);
        Planet planet2 = new Planet("Венера", 6051, 117);

        rsl.add(planet);
        rsl.add(planet1);
        rsl.add(planet2);

        Galaxy galaxy = new Galaxy("Млечный путь", rsl);

        Planet planet3 = new Planet("Земля", 40070, 24);
        Planet planet4 = new Planet("Венера", 6051, 117);

        galaxy.behavior(galaxy.planetList);
        galaxy.addPlanet(planet3);

        galaxy.behavior(galaxy.planetList);
        galaxy.getPlanet(planet4);

        galaxy.deletePlanet(planet4);
        galaxy.behavior(galaxy.planetList);

    }
}
