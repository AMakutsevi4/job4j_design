package ru.job4j.io;

import java.util.ArrayDeque;
import java.util.Deque;

public class Shell {

    private Deque<String> deque = new ArrayDeque<>();

    public void cd(String path) {
        String[] array = path.split("/");
        for (String temp : array) {
            if (temp.equals("")) {
                continue;
            }
            if (deque.contains(temp)) {
                deque.pollLast();
            }
            if (!temp.equals("..")) {
                deque.addFirst(temp);
            } else {
                deque.pollLast();
            }
        }
        if (deque.isEmpty()) {
            deque.addFirst("/");
        }
    }

    public String pwd() {
        StringBuilder sb = new StringBuilder();
        if (deque.contains("/")) {
            sb.append(deque.pollFirst());
        }
        while (!deque.isEmpty() && !deque.contains("/")) {
            sb.append("/").append(deque.pollLast());
        }
        return new String(sb);
    }
}