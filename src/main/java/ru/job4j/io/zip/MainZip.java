package ru.job4j.io.zip;

import java.io.File;
import java.io.IOException;

public class MainZip {
    public static void main(String[] args) throws IOException {
        new Validate(args);
        Zip zip = new Zip();
        zip.arguments(args);
       zip.makeList();
        System.out.println("Архивирование...");
        zip.packFiles((zip.getList()), new File(args[2].split("=")[1]));
        System.out.println("успешно завершено: " + zip.getObj() + " " + zip.getObj().toFile().length() / 1000 + " килобайт");
    }
}