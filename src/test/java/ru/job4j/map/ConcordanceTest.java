package ru.job4j.map;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConcordanceTest {
    @Test
    public void onlySpace() {
        String str = " ";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void onlySpaceWithSingleChar() {
        String str = "  t";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
                't', List.of(2)
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectCharacters() {
        String str = "Hello World";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
                'r', List.of(8),
                'd', List.of(10),
                'e', List.of(1),
                'W', List.of(6),
                'H', List.of(0),
                'l', List.of(2, 3, 9),
                'o', List.of(4, 7)
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectCharactersSecondVar() {
        String str = "Hello World hello world";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
                'r', List.of(8, 20),
                'd', List.of(10, 22),
                'e', List.of(1, 13),
                'W', List.of(6),
                'w', List.of(18),
                'H', List.of(0),
                'h', List.of(12),
                'l', List.of(2, 3, 9, 14, 15, 21),
                'o', List.of(4, 7, 16, 19)
        );
        assertThat(rsl, is(expected));
    }
}