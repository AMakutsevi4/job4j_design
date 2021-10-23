package ru.job4j.io.scanner;

import ru.job4j.io.ArgsName;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Читаем данные из CSV файла и выводим их.
 * В качестве входных данных задается путь к файлу path,
 * * разделитель delimiter, приемник данных out и фильтр по столбцам filter.
 * * Ключ -out имеет только два допустимых значения stdout или путь к файлу, куда нужно вывести.
 * Например, если есть файл CSV со столбцами name, age, birthDate, education, children
 * и программа запускается таким образом:
 * java -jar target/csvReader.jar -path=file.csv -delimiter=";"  -out=stdout -filter=name,age
 * то программа должна прочитать файл по пути file.csv и вывести только столбцы name, age в консоль.
 * В качестве разделителя данных выступает ;
 */
public class CSVReader {
    private final Path path;
    private final String delimiter;
    private final String out;
    private final String filter;
    List<List<String>> listAllTable = new ArrayList<>();

    public CSVReader(ArgsName argsName) {
        this.path = Path.of(argsName.get("path"));
        this.delimiter = argsName.get("delimiter");
        this.out = argsName.get("out");
        this.filter = argsName.get("filter");
    }

    /**
     * Читаем данные исходного файла, собираем их в лист.
     */
    public void handle(ArgsName argsName) throws Exception {
        Scanner scanner = new Scanner(new FileInputStream(String.valueOf(path)));
        while (scanner.hasNext()) {
            List<String> listString = new ArrayList<>();
            String string = scanner.nextLine();
            Scanner scannerString = new Scanner(new CharArrayReader(string.toCharArray())).useDelimiter(";");
            while (scannerString.hasNext()) {
                listString.add(scannerString.next());
            }
            listAllTable.add(listString);
        }
    }
}