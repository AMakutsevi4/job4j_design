package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public static void handle(ArgsName argsName) throws Exception {
        List<Integer> list = new ArrayList<>();
        if (ScanValid.validate()) {
            try (Scanner scanner = new Scanner(argsName.get("path"))) {
                scanner.useDelimiter(argsName.get("delimiter"));
                String[] column = scanner.next().split(",");
                String[] args = argsName.get("filter").split(",");
                for (String arg : args) {
                    for (int index = 0; index < column.length; index++) {
                        if (arg.equals(column[index])) {
                            list.add(index);
                            break;
                        }
                    }
                }
                while (scanner.hasNext()) {
                    column = scanner.next().split(",");
                    for (Integer integer : list) {
                        System.out.println(column[integer]);
                    }
                }
            }
        }
    }
}