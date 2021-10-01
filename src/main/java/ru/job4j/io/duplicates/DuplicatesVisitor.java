package ru.job4j.io.duplicates;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class DuplicatesVisitor extends SimpleFileVisitor<Path> {
    HashSet<FileProperty> set = new HashSet<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileProperty fileProperty = new FileProperty(file.toFile().length(), file.toFile().getName());
        if (!set.add(fileProperty)) {
            System.out.println("Найдены следующие дубликаты: ");
            System.out.println(fileProperty);
        }
        System.out.println("File name: " + fileProperty.getName() + ", File size: " + fileProperty.getSize());
        return super.visitFile(file, attrs);
    }
}