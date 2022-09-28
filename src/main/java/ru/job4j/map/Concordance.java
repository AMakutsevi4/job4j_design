package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> res = new HashMap<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == ' ') {
               continue;
            }
            res.putIfAbsent(c[i], new ArrayList<>());
            res.get(c[i]).add(i);
        }
        return res;
    }
}
