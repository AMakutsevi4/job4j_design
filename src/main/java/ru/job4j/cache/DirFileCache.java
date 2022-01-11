package ru.job4j.cache;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        StringBuilder str = new StringBuilder();
        try (BufferedReader out = new BufferedReader(new FileReader(new File(cachingDir, key)))) {
            String next = out.readLine();
            while (next != null) {
                str.append(next);
                next = out.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}