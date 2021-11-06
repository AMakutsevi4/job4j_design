package ru.job4j.io.filesearch;

import ru.job4j.io.Search;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {
    private final String directory;
    private final String nameFile;
    private final String outFile;
    private List<Path> arrayList = new ArrayList<>();

    public FileFinder(String directory, String nameFile, String outFile) {
        this.directory = directory;
        this.nameFile = nameFile;
        this.outFile = outFile;
    }

    public void search(String[] args) {
        Path start = Paths.get(String.valueOf(directory));
        try {
            arrayList = Search.search(start, p -> p.toFile().getPath().contains(nameFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(String[] args) {
        search(args);
         try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile, true)))) {
            for (Path p : arrayList) {
                out.println(p.getFileName().toString());
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileCheck fileCheck = new FileCheck(args);
        FileFinder file = new FileFinder(fileCheck.getDirectory(), fileCheck.getNameFile(), fileCheck.getOutFile());
        file.save(args);
        System.out.println("Done");
    }
}