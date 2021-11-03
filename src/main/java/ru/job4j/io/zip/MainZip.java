package ru.job4j.io.zip;

import java.io.File;
import java.io.IOException;

public class MainZip {
    public static void main(String[] args) throws IOException {
        Validate validate = new Validate();
        validate.Validator(args);
        Zip zip = new Zip();
        zip.arguments(args);
        zip.makeList();
        System.out.println("Архивирование...");
        zip.packFiles((zip.getList()), new File(String.valueOf(zip.getObj())));
        System.out.println("успешно завершено: " + zip.getObj() + " " + zip.getObj().toFile().length() / 1000 + " мегабайт");
    }
}