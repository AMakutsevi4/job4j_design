package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            String first = String.valueOf(s.charAt(0));
            rsl.putIfAbsent(first, new ArrayList<>());
            rsl.get(first).add(s);
        }
        return rsl;
    }
}
