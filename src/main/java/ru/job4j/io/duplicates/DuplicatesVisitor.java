package ru.job4j.io.duplicates;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesVisitor extends SimpleFileVisitor<Path> {
    Map<FileProperty, Path> files = new HashMap<>();
    List<Path> paths = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileProperty fileProperty = new FileProperty(file.toFile().length(), file.toFile().getName());
        if (files.get(fileProperty) == null) {
            files.put(fileProperty, file.toAbsolutePath());
            return super.visitFile(file, attrs);
        } else {
            paths.add(file);
        }
        return super.visitFile(file, attrs);
    }
    public List<Path> getPaths() {
        return paths;
    }
    public Map<FileProperty, Path> getFiles() {
        return files;
    }
}
