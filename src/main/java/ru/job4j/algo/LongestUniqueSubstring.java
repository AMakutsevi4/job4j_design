package ru.job4j.algo;

import java.util.*;

public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String str) {
        TreeMap<Integer, Map<Character, Integer>> integerMap = new TreeMap<>();
        Map<Character, Integer> characterMap = new HashMap<>();
        StringBuilder rsl = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            Character character = str.charAt(i);
            if (!characterMap.containsKey(character)) {
                characterMap.put(character, i);

            } else {

                integerMap.put(characterMap.size(), characterMap);
                characterMap = new HashMap<>();
                characterMap.put(character, i);
            }
        }
        integerMap.put(characterMap.size(), characterMap);

        for (Character c : integerMap.get(integerMap.lastKey()).keySet()) {
            rsl.append(c);
        }

        return rsl.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbbbcd";
        System.out.println(longestUniqueSubstring(str));
    }
}
