package ru.job4j.io.zip;

import ru.job4j.io.ArgsName;

import java.nio.file.Files;
import java.nio.file.Path;

public class ArgsStore {
    private final String format;
    private final Path obj;
    private final Path path;

    public ArgsStore(String[] args) {
        validateLength(3, args);
        ArgsName argsName = ArgsName.of(args);
        String directory = argsName.get("d");
        String format = argsName.get("e");
        String obj = argsName.get("o");
        checkNull(directory);
        checkNull(format);
        checkNull(obj);
        this.format = format;
        this.obj = Path.of(obj);
        this.path = Path.of(directory);
        validateDirectory(path);
    }

    public String getFormat() {
        return format;
    }

    public Path getObj() {
        return obj;
    }

    public Path getPath() {
        return path;
    }

    private void validateLength(int i, String[] args) {
        if (args.length != i) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
    }

    public void validateDirectory(Path path) {
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("Отсутствует директория. " + path);
        }
    }

    private void checkNull(String param) {
        if (param == null) {
            throw new NullPointerException(" Не верный аргумент ");
        }
    }
}