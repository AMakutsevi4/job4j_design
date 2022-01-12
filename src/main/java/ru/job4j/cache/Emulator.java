package ru.job4j.cache;

import java.io.IOException;

public class Emulator {

    public static DirFileCache dir(String key) {
        return new DirFileCache(key);
    }

    public String outCache(DirFileCache dir, String key) throws IOException {
        return dir.load(key);
    }

    public static void main(String[] args) throws IOException {
        Emulator emulator = new Emulator();
        DirFileCache dirCache = dir("./src/main/java/ru/job4j/cache");
        String rsl = emulator.outCache(dirCache, "Names.txt");
        System.out.println(rsl);
        String rsl1 = emulator.outCache(dirCache, "Address.txt");
        System.out.println(rsl1);
    }
}