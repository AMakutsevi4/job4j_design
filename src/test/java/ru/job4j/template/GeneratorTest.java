package ru.job4j.template;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GeneratorTest {

    @Ignore
    @Test
    public void whenTemplateThenWork() {
        String test = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = Map.of("name", "Alexandr Makutsevich", "subject", "you");
        TextGenerator textGenerator = new TextGenerator();
        textGenerator.produce(test, map);
        String wait = "I am a Alexandr Makutsevich, Who are you? ";
        assertThat(textGenerator, is(wait));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenTemplateThenMoreKeys() {
        String test = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = Map.of("name", "Alexandr Makutsevich", "subject", "you", "Age", "30");
        TextGenerator textGenerator = new TextGenerator();
        textGenerator.produce(test, map);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenTemplateThenNoKeys() {
        String test = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = Map.of("name", "Alexandr Makutsevich");
        TextGenerator textGenerator = new TextGenerator();
        textGenerator.produce(test, map);
    }
}
