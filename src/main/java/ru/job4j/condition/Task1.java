package ru.job4j.condition;

public class Task1 {

    public static String maxMatch(String[] strings) {
        int index = 0;
        StringBuilder builder = new StringBuilder();
        if (strings.length == 0) {
            builder.append("");
        } else if (strings.length == 1) {
            builder.append(strings[0]);
        } else {
            String rsl = strings[0];
            while (strings.length != index && rsl.charAt(index) == strings[1].charAt(index) && rsl.charAt(index) == strings[2].charAt(index++)) {
                builder.append(strings[1].charAt(index - 1));
            }
        }
        return String.valueOf(builder);
    }
}
