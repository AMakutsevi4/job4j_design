package ru.job4j.io.duplicates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;


public class DuplicatesFinder {
    public static void main(String[] args) throws IOException {
        DuplicatesVisitor searcher = new DuplicatesVisitor();
        Files.walkFileTree(Path.of("C:\\a"), searcher);
        System.out.println("Найден оригинал (размер / имя / путь :");
        for (Map.Entry<FileProperty, Path> q : searcher.getFiles().entrySet()) {
            System.out.println(q);
        }
        System.out.println("Найден дубликат :");
        for (Path p : searcher.getPaths()) {
            System.out.println(p);
        }
    }
}
