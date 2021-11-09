package ru.job4j.io.filesearch;

import ru.job4j.io.Search;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFinder {
    private final String directory;
    private final String nameFile;
    private final String outFile;
    private final String regularExp;
    private List<Path> arrayList = new ArrayList<>();

    public FileFinder(String directory, String nameFile, String outFile, String regularExp) {
        this.directory = directory;
        this.nameFile = nameFile;
        this.regularExp = regularExp;
        this.outFile = outFile;
    }

    public void search(String[] args) {
        try {
            Path start = Paths.get(String.valueOf(directory));
            if (regularExp.contains("name")) {
                arrayList = Search.search(start, p -> p.toFile().getPath().contains(nameFile));
            } else if (regularExp.equals("mask")) {
                Pattern pattern = Pattern.compile("[A-j]");
                Matcher matcher = pattern.matcher(directory);
                if (matcher.find()) {
                    arrayList = Search.search(start, p -> p.toFile().getPath().contains(matcher.group()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(String[] args) {
        search(args);
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
        FileFinder file = new FileFinder(fileCheck.getDirectory(), fileCheck.getNameFile(), fileCheck.getOutFile(), fileCheck.getRegularExp());
        file.save(args);
        System.out.println("Done");
    }
}