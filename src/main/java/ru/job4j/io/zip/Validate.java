package ru.job4j.io.zip;

public class Validate {
    public Validate(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
    }
}