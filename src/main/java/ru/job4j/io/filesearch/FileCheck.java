package ru.job4j.io.filesearch;

import ru.job4j.io.ArgsName;
public class FileCheck {

    private final String directory;
    private final String nameFile;
    private final String outFile;
    private final String regularExp;

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
        this.nameFile = nameFile;
        this.regularExp = regularExp;
        this.outFile = outFile;
      }

    public String getDirectory() {
        return directory;
    }

    public String getNameFile() {
        return nameFile;
    }

    public String getRegularExp() {
        return regularExp;
    }

    public String getOutFile() {
        return outFile;
    }

    private void validateLength(int i, String[] args) {
        if (args.length != i) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
    }

    private void checkNull(String param) {
        if (param == null) {
            throw new IllegalArgumentException(" Не верный аргумент ");
        }
    }
}