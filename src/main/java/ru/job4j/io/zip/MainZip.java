package ru.job4j.io.zip;

import java.io.File;
import java.io.IOException;

/**
 * Параметры для архивирования
 * -d - directory                                             -e - exclude -o - output
 * -d=C:\IdeaProjects\job4j_design\src\main\java\ru\job4j\io -e=*.java -o=project.zip
 */

public class MainZip {
    public static void main(String[] args) throws IOException {
        ArgsStore argStore = new ArgsStore(args);
        Zip zip = new Zip(argStore.getFormat(), argStore.getObj(), argStore.getPath());
        zip.makeList();
        System.out.println("Архивирование...");
        zip.packFiles((zip.getList()), new File(String.valueOf(zip.getObj())));
        System.out.println("успешно завершено: " + zip.getObj() + " " + zip.getObj().toFile().length() / 1000 + " мегабайт");
    }
}