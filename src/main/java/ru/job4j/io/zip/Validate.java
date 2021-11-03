package ru.job4j.io.zip;

import java.nio.file.Files;

public class Validate {
       public void validator(String[] args) {
        Zip zip = new Zip();
        zip.arguments(args);
        if (args.length != 3) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
        if (!Files.exists(zip.getPath())) {
            throw new IllegalArgumentException("Отсутствует директория. " + (zip.getPath()));
        }
    }
}