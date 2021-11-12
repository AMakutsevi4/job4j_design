package ru.job4j.io.filesearch;

import ru.job4j.io.ArgsName;
public class FileCheck {

    private final String directory;
    private final String searchFile;
    private final String outFile;
    private final String typeSearch;

    public FileCheck(String[] args) {
        validateLength(4, args);
        ArgsName argsName = ArgsName.of(args);
        String directory = argsName.get("d");
        String nameFile = argsName.get("n");
        String regularExp = argsName.get("t");
        String outFile = argsName.get("o");
        checkNull(directory);
        checkNull(nameFile);
        checkNull(regularExp);
        checkNull(outFile);
        this.directory = directory;
        this.searchFile = nameFile;
        this.typeSearch = regularExp;
        this.outFile = outFile;
      }

    public String getDirectory() {
        return directory;
    }

    public String getSearchFile() {
        return searchFile;
    }

    public String getTypeSearch() {
        return typeSearch;
    }

    public String getOutFile() {
        return outFile;
    }

    private void validateLength(int needCount, String[] args) {
        if (args.length != needCount) {
            throw new IllegalArgumentException("для работы программы не хватает аргументов, проверьте.");
        }
    }

    private void checkNull(String param) {
        if (param == null) {
            throw new IllegalArgumentException(" Не верный аргумент ");
        }
    }
}