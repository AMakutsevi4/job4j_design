package ru.job4j.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;

public class Search {
    private static Path file;
    private static String index;

    public static void main(String[] args) throws IOException {
        Search validateSearch = new Search();
        validateSearch.validate(args);
        System.out.println("Start directory :" + args[0] + "File ends with :" + args[1]);
        search(file, p -> p.toFile().getName().endsWith(index)).forEach(System.out::println);
    }

    public static List<Path> search(Path root, Predicate<Path> condition) throws IOException {
        SearchFiles searcher = new SearchFiles(condition);
        Files.walkFileTree(root, searcher);
        return searcher.getPaths();
    }

    private void validate(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
        file = Path.of(args[0]);
        if (!file.toFile().exists()) {
            throw new IllegalArgumentException(file + "Not exist %s");
        }
        if (!file.toFile().isDirectory()) {
            throw new IllegalArgumentException(file + "Not directory %s");
        }
        index = args[1];
    }
}
