package ru.job4j.design.srp;

public class SerializationXML implements Serialization {

    @Override
    public String generate(String filter) {
        StringBuilder str = new StringBuilder();
        str.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>")
                .append(System.lineSeparator())
                .append("<filter>")
                .append(filter)
                .append("</filter>");
        return str.toString();
    }
}
