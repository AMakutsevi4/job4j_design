package ru.job4j.io.Scanner;

public class ScanValid {
    public void validate(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException("Проверьте аргументы "
                    + "-path = таблица csv "
                    + "-delimiter = Разделитель значений "
                    + "-out = приемник данных"
                    + "-filter = колонки для сортировки");
        }
    }
}
