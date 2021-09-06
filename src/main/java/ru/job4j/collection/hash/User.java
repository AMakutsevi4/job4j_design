package ru.job4j.collection.hash;

import java.util.*;

public class User {
    private final String name;
    private final int children;
    private final Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Map<User, Object> user = new HashMap<>();
        User one = new User("Alexander", 1, new GregorianCalendar(1991, Calendar.AUGUST, 28));
        User two = new User("Alexander", 1, new GregorianCalendar(1991, Calendar.AUGUST, 28));
        user.put(one, new Object());
        user.put(two, new Object());
    }
}