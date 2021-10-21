package ru.job4j.io.zip;

import ru.job4j.io.ArgsName;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static ru.job4j.io.Search.search;

/**
 * Параметры для архивирования
 * -d - directory                                       -e - exclude -o - output
 * -d=C:\Users\MakutsevichAI\IdeaProjects\job4j_design4 -e=class -o=project.zip
 */
public class Zip {
    public static String format;
    public static Path obj;
    public static List<File> list;
    public static Path path;

    public static void param(String[] args) {
        ArgsName argsName = ArgsName.of(args);
        path = Path.of(argsName.get("d"));
        format = argsName.get("e");
        obj = Path.of(argsName.get("o"));
    }

    public static void packFiles(List<File> sources, File target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            for (File f : sources) {
                makeList();
                zip.putNextEntry(new ZipEntry(f.getPath()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(f))) {
                    zip.write(out.readAllBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void makeList() throws IOException {
        list = search(path, p -> !p.toFile().getName().endsWith(format))
                .stream()
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    private static void validate(String[] args) throws IllegalArgumentException {
        if (args.length != 3) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
        if (!Files.isDirectory(Path.of(String.valueOf(path)))) {
            throw new IllegalArgumentException("Отсутствуюет директория. " + (args[0]));
        }
    }

    public static void main(String[] args) throws IOException {
        param(args);
        validate(args);
        System.out.println("Архивирование...");
        packFiles(list, new File(args[2].split("=")[1]));
        if (Files.exists(obj) && obj.toFile().length() > 0) {
            System.out.println("успешно завершено: " + obj + " " + obj.toFile().length() / 1000000 + " мегабайт");
        }
    }
}