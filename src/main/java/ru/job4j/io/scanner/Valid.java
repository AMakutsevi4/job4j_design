package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;

public class Valid {

    public void reliability(String[] args) {
        ArgsName argsName = ArgsName.of(args);
        if (args.length < 4) {
            throw new IllegalArgumentException("Не указаны все необходимые параметры");
        }
        if (argsName.get("path") == null) {
            throw new IllegalArgumentException("Не указана директория с файлом CSV");
        }
        if (argsName.get("delimiter") == null) {
            throw new IllegalArgumentException("Не указан символ разделителя");
        }
        if (argsName.get("out") == null) {
            throw new IllegalArgumentException("Не указан файл для записи данных");
        }
        if (argsName.get("filter") == null) {
            throw new IllegalArgumentException("Не указаны поля сортировки");
        }
    }
}
