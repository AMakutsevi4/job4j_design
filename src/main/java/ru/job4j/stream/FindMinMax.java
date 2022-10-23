package ru.job4j.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (items.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        }
    }

    public static void main(String[] args) {

        Integer[] ints = {13, 16, 25, 62, 384, 745, 502, 200};
        Comparator<Integer> comparator = Comparator.comparingInt(o -> o);
        BiConsumer<Integer, Integer> biConsumer = (t, u) -> System.out.println(t + " " + u);
        findMinMax(Arrays.stream(ints), comparator, biConsumer);
    }
}