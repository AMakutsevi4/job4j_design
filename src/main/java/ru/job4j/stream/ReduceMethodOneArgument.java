package ru.job4j.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
         return list.stream().reduce(((integer, integer2) -> integer * integer2)).get();
    }
}