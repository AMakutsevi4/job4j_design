package ru.job4j.io.filesearch;

import ru.job4j.io.Search;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
            Path start = Paths.get(String.valueOf(directory));
            if (typeSearch.contains("name")) {
                arrayList = Search.search(start, p -> p.toFile().getPath().contains(searchFile));
            } else if (typeSearch.equals("mask")) {
               searchFile = searchMask();
                arrayList = Search.search(start, p -> p.toFile().getPath().contains(searchFile));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String searchMask() {
        return searchFile.replaceAll("\\*", ".*")
                .replaceAll("\\?", "\\w");
    }

    public void save() {
        search();
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile, true)))) {
            for (Path p : arrayList) {
                out.println(p.getFileName().toString());
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