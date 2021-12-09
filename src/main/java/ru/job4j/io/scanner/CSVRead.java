package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class CSVRead {
    private final Path path;
    private final String delimiter;
    private final String out;
    private final String filter;

    public CSVRead(ArgsName argsName) {
        this.path = Path.of(argsName.get("path"));
        this.delimiter = argsName.get("delimiter");
        this.out = argsName.get("out");
        this.filter = argsName.get("filter");
    }

    public static void validate(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException("Проверьте аргументы..");
        }
    }

    public StringBuilder outRes(int[] indFilter) {
        StringBuilder res = new StringBuilder();
        try (Scanner scanArgs = new Scanner(path).useDelimiter(System.lineSeparator())) {
            while (scanArgs.hasNextLine()) {
                List<String> column = List.of(scanArgs.next().split(delimiter));
                for (int i = 0; i < indFilter.length; i++) {
                    res.append(column.get(indFilter[i]));
                    if (i != indFilter.length - 1) {
                        res.append(";");
                    }
                }
                res.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public int[] getArgsFilter(String filter) throws IOException {
        Scanner scanner = new Scanner(path).useDelimiter(System.lineSeparator());
        String[] columns = scanner.next().split(delimiter);
        return IntStream.range(0, columns.length)
                .filter(i -> filter.contains(columns[i])).toArray();

    }

    public void handle() throws IOException {
        StringBuilder outPrint = outRes(getArgsFilter(filter));
        if (out.equals("stdout")) {
            System.out.println(outPrint);
        } else {
            try (FileWriter writer = new FileWriter(out)) {
                writer.write(String.valueOf(outPrint));
            }
        }
    }

    public static void main(String[] args) {
        validate(args);
        CSVRead cvs = new CSVRead(ArgsName.of(args));
        try {
            cvs.handle();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}