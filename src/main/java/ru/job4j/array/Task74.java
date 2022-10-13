package ru.job4j.array;

public class Task74 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        int head = 0;
        int middle = arr.length / 2;
        int tail = arr.length - 1;
        while (head != arr.length / 2) {
            s.append(arr[head++]).append(" ");
        }
        s.deleteCharAt(s.length() - 1);
        s.append(System.lineSeparator());
        while (tail >= middle) {
            s.append(arr[tail--]).append(" ");
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
