package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String q = fio[1];
        String r = String.valueOf(q.charAt(0));
        String y = fio[2];
        String u = String.valueOf(y.charAt(0));
        return fio[0] + " " + r + "." + u + ".";
    }
}
