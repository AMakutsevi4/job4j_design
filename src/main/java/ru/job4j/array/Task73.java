package ru.job4j.array;

public class Task73 {
    public static void array(int[] arr) {
        StringBuilder s = new StringBuilder();
        int head = 0;
        int middle = arr.length / 2;
        int tail = arr.length - 1;
        while (tail != 0 && head != arr.length / 2) {
            s.append(arr[head]).append(" ").append(arr[tail]).append(System.lineSeparator());
            head++;
            tail--;
       }
        if (arr.length % 2 != 0) {
            s.append(arr[middle]).append(System.lineSeparator());
        }
        System.out.print(s);
    }
}
