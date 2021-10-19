package ru.job4j.io.chat;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {

    public void validate(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
        if (!Files.exists(Path.of(args[0]))) {
            throw new FileNotFoundException("Файл не существует: " + args[0]);
        }
    }
}