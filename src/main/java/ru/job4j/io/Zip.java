package ru.job4j.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static ru.job4j.io.Search.search;

public class Zip {
    private static String format;
    private static Path obj;
    private static List<File> list;

    public static void packFiles(List<File> sources, File target) {
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

    public static void packSingleFile(File source, File target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            zip.putNextEntry(new ZipEntry(source.getPath()));
            try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(source))) {
                zip.write(out.readAllBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void validate(String[] args) throws IllegalArgumentException, IOException {
        if (args.length != 3) {
            throw new IllegalArgumentException("Отсутствуют параметры.");
        }
        ArgsName argsName = ArgsName.of(args);
        Path path = Path.of(argsName.get("d"));
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("Каталог не найден: " + path);
        }
        format = argsName.get("e");
        obj = Path.of(argsName.get("o"));
        list = search(path, p -> !p.toFile().getName().endsWith(format))
                .stream()
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        validate(args);
        packFiles(list, new File(args[2].split("=")[1]));
        System.out.println("Архивирование успешно завершено: " + obj + " " + obj.toFile().length() + " байт");
    }
}