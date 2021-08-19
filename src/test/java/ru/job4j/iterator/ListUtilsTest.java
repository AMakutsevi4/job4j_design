package ru.job4j.iterator;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertThat;

public class ListUtilsTest {

    @Test
    public void whenAddBefore() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addBefore(input, 1, 2);
        assertThat(Arrays.asList(1, 2, 3), Is.is(input));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenAddBeforeWithInvalidIndex() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addBefore(input, 3, 2);
    }

    @Test
    public void whenAddAfterLast() {
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 2));
        ListUtils.addAfter(input, 2, 3);
        assertThat(Arrays.asList(0, 1, 2, 3), Is.is(input));
    }

    @Test
    public void whenRemoveIf() {
        List<String> input = new ArrayList<>(Arrays.asList("uno", "dos", "tres", "quatro"));
        Predicate<String> filter = i -> i.length() > 3;
        ListUtils.removeIf(input, filter);
        assertThat(Arrays.asList("uno", "dos"), Is.is(input));
    }
    @Test
    public void whenReplaceIf() {
        List<String> input = new ArrayList<>(Arrays.asList("uno"));
        Predicate<String> filter = i -> i.contains("o");
        ListUtils.replaceIf(input, filter, "uop");
        assertThat(Arrays.asList("uop"), Is.is(input));
    }
    @Test
    public void whenRemoveAll() {
        List<String> input = new ArrayList<>(Arrays.asList("uno", "dos", "tres", "quatro"));
        List<String> elem = new ArrayList<>(Arrays.asList("uno", "dos", "tres", "quatro"));
        ListUtils.removeAll(input, elem);
        assertThat(Arrays.asList(), Is.is(input));
    }
}