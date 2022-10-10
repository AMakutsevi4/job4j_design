package ru.job4j.stream;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FarmTest {
    @Test
    public void sumLegs() {
        Map<Farm.Animal, Integer> data = Map.of(
                new Farm.Animal("chicken", 2), 5,
                new Farm.Animal("cow", 4), 2,
                new Farm.Animal("pig", 4), 8
        );
        int rsl = Farm.sumLegs(data);
        assertThat(rsl, is(50));
    }
}