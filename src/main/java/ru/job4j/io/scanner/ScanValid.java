package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;

import java.io.File;

public class ScanValid {
    private static ArgsName argsName;
    private static Integer size;

    public ScanValid() {
        argsName = new ArgsName();
    }

    public static boolean validate() throws IllegalAccessException {
        path();
        delimiter();
        parameter();
        filter();
        return size == 4;
    }

    public static String path() throws IllegalAccessException {
        File file = new File(argsName.get("path"));
        if (!file.exists()) {
            throw new IllegalAccessException("Invalid directory.");
        }
        size++;
        return argsName.get("path");
    }

    public static void delimiter() throws IllegalAccessException {
        if (!argsName.get("delimiter").equals(";") || !argsName.get("delimiter").equals(",")) {
            throw new IllegalAccessException("Invalid delimiter");
        }
        size++;
        argsName.get("delimiter");
    }

    public static void parameter() throws IllegalAccessException {
        File file = new File(argsName.get("out"));
        if (!argsName.get("out").equals("stdout") || !file.isFile()) {
            throw new IllegalAccessException("Invalid parameter.");
        }
        size++;
    }

    public static void filter() throws IllegalAccessException {
        if (argsName.get("filter").isEmpty()) {
            throw new IllegalAccessException("Invalid filter.");
        }
        size++;
        argsName.get("filter");
    }
}
