package ru.job4j.cache;

import java.nio.file.Files;
import java.nio.file.Path;

public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        String load = null;
        try {
            load = Files.readString(Path.of(cachingDir, key));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return load;
    }
}