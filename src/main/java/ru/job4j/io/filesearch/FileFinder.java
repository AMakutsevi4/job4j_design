package ru.job4j.io.filesearch;

import ru.job4j.io.Search;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileFinder {
    private final String directory;
    private String searchFile;
    private final String outFile;
    private final String typeSearch;
    private List<Path> arrayList = new ArrayList<>();

    public FileFinder(String directory, String nameFile, String outFile, String regularExp) {
        this.directory = directory;
        this.searchFile = nameFile;
        this.typeSearch = regularExp;
        this.outFile = outFile;
    }

    public void search() {
        try {
            Pattern pattern;
            Path start = Paths.get(String.valueOf(directory));
            if (typeSearch.contains("name")) {
                arrayList = Search.search(start, p -> p.toFile().getPath().contains(searchFile));
            } else if ("mask".equals(typeSearch)) {
                searchFile = searchMask();
                pattern = Pattern.compile(searchFile);
                arrayList = Search.search(start, p -> p.toFile().getName().matches(pattern.toString()));
            } else if ("regex".equals(typeSearch)) {
                pattern = Pattern.compile(searchFile);
                arrayList = Search.search(start, p -> p.toFile().getName().matches(pattern.toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String searchMask() {
        String mask = searchFile.replaceAll("\\*", ".\\*");
        mask = mask.replaceAll("\\?", ".\\?");
        return mask;
    }

    public void save() {
        search();
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile, true)))) {
            for (Path p : arrayList) {
                out.println(p.getFileName().toAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileCheck fileCheck = new FileCheck(args);
        FileFinder file = new FileFinder(fileCheck.getDirectory(), fileCheck.getSearchFile(), fileCheck.getOutFile(), fileCheck.getTypeSearch());
        file.save();
        System.out.println("Done");
    }
}