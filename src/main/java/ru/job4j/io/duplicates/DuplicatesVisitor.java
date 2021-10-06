package ru.job4j.io.duplicates;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicatesVisitor extends SimpleFileVisitor<Path> {
    HashMap<FileProperty, FileProperty> myHashmap = new HashMap<>();
    List<String> array = new ArrayList<>();


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileProperty fileProperty = new FileProperty(file.toFile().length(), file.toFile().getName());
        FileProperty fileProperty1 = new FileProperty(file.toFile().lastModified(), file.toFile().getPath());
                   myHashmap.put(fileProperty, fileProperty1);
             getMyHashmap();
        return super.visitFile(file, attrs);
    }

    public HashMap<FileProperty, FileProperty> getMyHashmap() {
        System.out.println(myHashmap);
        return myHashmap;
    }
}