package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            while (iterator.hasNext()) {
                rsl.add(iterator.next());
            }
        }
        return rsl;
    }

    public static List<Integer> flattenExampleTwo(Iterator<Iterator<Integer>> it) {
        return iteratorToStream(it)
                .flatMap(FlatIt::iteratorToStream)
                .collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false);
    }
}