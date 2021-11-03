package ru.job4j.io.zip;

import ru.job4j.io.ArgsName;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.nio.file.Path.of;
import static ru.job4j.io.Search.search;

/**
 * Параметры для архивирования
 * -d - directory                                             -e - exclude -o - output
 * -d=C:\IdeaProjects\job4j_design\src\main\java\ru\job4j\io -e=*.java -o=project.zip
 */
public class Zip {
    private String format;
    private Path obj;
    private List<File> list;
    private Path path;

    public void arguments(String[] args) {
        ArgsName argsName = ArgsName.of(args);
        format = argsName.get("e");
        obj = of(argsName.get("o"));
        path = of(argsName.get("d"));

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