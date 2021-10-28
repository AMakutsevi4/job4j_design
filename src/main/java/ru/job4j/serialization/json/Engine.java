package ru.job4j.serialization.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Engine")
public class Engine {
    @XmlAttribute
    private String power;

    public Engine(String power) {
        this.power = power;
    }

    public Engine() {

    }

    @Override
    public String toString() {
        return "Engine{"
                + "power='" + power + '\''
                + '}';
    }
}