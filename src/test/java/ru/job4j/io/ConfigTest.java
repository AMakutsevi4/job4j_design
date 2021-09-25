package ru.job4j.io;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConfigTest {

    @Test
    public void whenPairWithoutComment() {
        String path = "./data/pair_without_comment.properties.txt";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("Key"), is("Value"));
        assertThat(config.value("key5"), is(Matchers.nullValue()));
    }

    @Test
    public void whenOneLineEmpty() {
        String path = "./data/empty_oneLine_without_comment.properties.txt";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("Key"), is("Value"));
    }

    @Test
    public void whenBrokenPatternThenException() {
        String path = "./data/broken_pattern_without_comment.properties.txt";
        Config config = new Config(path);
        config.load();
    }
}