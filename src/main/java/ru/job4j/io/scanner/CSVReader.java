package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class CSVReader {
/**  -path=./src/data/table.csv -delimiter=";"  -out=stdout -filter=name,age */

    public static void handle(ArgsName argsName) {
        Path directory = Path.of(argsName.get("path"));
        String delimiter = argsName.get("delimiter");
        String flag = argsName.get("out");
        String[] filter = argsName.get("filter").split(",");
        StringBuilder builder = new StringBuilder();
        String[] header = null;
        try (Scanner scanner = new Scanner(directory).useDelimiter(System.lineSeparator())) {
            if (scanner.hasNext()) {
                header = scanner.nextLine().split(delimiter);
            }
            assert header != null;
            int[] positions = new int[filter.length];
            int count = 0;
            for (String s : filter) {
                builder.append(s).append(";");
                for (int j = 0; j < header.length; j++) {
                    if (s.equals(header[j])) {
                        positions[count++] = j;
                    }
                }
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.append(System.lineSeparator());
            while (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(delimiter);
                for (int position : positions) {
                    builder.append(array[position]).append(";");
                }
                builder.deleteCharAt(builder.length() - 1);
                builder.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        save(builder, flag);
    }

    private static void save(StringBuilder builder, String target) {
        if (target.equals("stdout")) {
            System.out.println(builder);
        } else {
            try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(target))) {
                printWriter.print(builder);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Valid valid = new Valid();
        valid.reliability(args);
        ArgsName argsName = ArgsName.of(args);
        handle(argsName);
    }
}