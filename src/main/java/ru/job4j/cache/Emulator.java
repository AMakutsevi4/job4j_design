package ru.job4j.cache;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Emulator {

    private final Scanner scanner = new Scanner(System.in);
    DirFileCache dirCache = dir("./src/main/java/ru/job4j/cache");

    public static DirFileCache dir(String key) {
        return new DirFileCache(key);
    }

    public static void main(String[] args) throws IOException {
        new Emulator().work();
    }

    private void work() throws IOException {
        boolean work = true;
        int choice;
        while (work) {
            showMenu();
            System.out.println("Выберите пункт:");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                dirCache();
            }
            if (choice == 2) {
                putCache();
            }
            if (choice == 3) {
                getCache();
            }
            if (choice == 4) {
                work = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("--Меню--");
        System.out.println("--1. Укажите директорию--");
        System.out.println("--2. Введите имя файла для загрузки в кеш--");
        System.out.println("--3. Введите имя файла для получения содержимого--");
        System.out.println("--4. Выход--");
    }

    private void dirCache() {
        System.out.println("Укажите путь к директории: ");
        String way = scanner.nextLine();
        if (Files.isDirectory(Path.of(way))) {
            dirCache = new DirFileCache(way);
            System.out.println("директория успешно найдена " + way);

        } else {
            System.out.println("Указанной директории не существует " + way);
        }
    }

    private void putCache() throws IOException {
        System.out.print("Введите имя файла для добавления в кеш:");
        String file = scanner.nextLine();
        dirCache.put(file, null);
        dirCache.get(file);
    }

    private void getCache() throws IOException {
        System.out.print("Введите имя файла для получения содержимого:");
        String file = scanner.nextLine();
        System.out.println(dirCache.get(file));
    }
}