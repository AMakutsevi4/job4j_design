package ru.job4j.io.zip;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import static ru.job4j.io.Search.search;


public class Zip {
    private final String format;
    private final Path obj;
    private List<File> list;
    private final Path path;

    public Zip(String format, Path obj, Path path) {
        this.format = format;
        this.obj = obj;
        this.path = path;
    }

    public Path getObj() {
        return obj;
    }

    public List<File> getList() {
        return list;
    }

    public Path getPath() {
        return path;
    }

    public void packFiles(List<File> sources, File target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            for (File f : sources) {
                zip.putNextEntry(new ZipEntry(f.getPath()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(f))) {
                    zip.write(out.readAllBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeList() throws IOException {
        list = search(path, p -> !p.toFile().getName().endsWith(format))
                .stream()
                .map(Path::toFile)
                .collect(Collectors.toList());
    }
}