package ru.job4j.assertj;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleConvertTest {

    @Test
    void checkArray() {
        SimpleConvert simpleConvert = new SimpleConvert();
        String[] array = simpleConvert.toArray("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkList() {
        SimpleConvert convert = new SimpleConvert();
        List<String> array = convert.toList("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("three")
                .containsSequence("first", "second");
    }

    @Test
    void checkSet() {
        SimpleConvert convert = new SimpleConvert();
        Set<String> array = convert.toSet("first", "second", "three", "four", "five", "six");
        assertThat(array).hasSize(6)
                .contains("six")
                .anySatisfy(s -> {
                            assertThat(s).isEqualTo("four");
                            assertThat(s).isLessThan("six");
                        }
                )
                .allMatch(s -> s.length() > 2);
    }

    @Test
    void checkMap() {
        SimpleConvert convert = new SimpleConvert();
        Map<String, Integer> map = convert.toMap("1", "2", "3");
        assertThat(map).hasSize(3)
                .containsKey("1")
                .containsValues(0, 1, 2)
                .containsEntry("2", 1);

    }
}