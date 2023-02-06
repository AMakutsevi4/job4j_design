package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GenericArray {
    public static void main(String[] args) {
        String[] strings = convert(String.class, List.of("Val1", "Val2", "Val3")
        );
        System.out.println(Arrays.toString(strings));
    }

    public static <T> T[] convert(Class<T> tClass, List<T> values) {
        T[] array = (T[]) Array.newInstance(tClass, values.size());
        for (int i = 0; i < values.toArray().length; i++) {
            array[i] = values.get(i);
        }
        return array;
    }
}
