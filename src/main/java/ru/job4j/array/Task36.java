package ru.job4j.array;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = number % 1000 / 10;
        last = number % 10;
        String result = (last > 0 ? String.valueOf(last) : "")
                + (middle > 0 ? String.valueOf(middle) : "" + (last > 0 && first > 0 ? "00" : ""))
                + (first > 0 ? String.valueOf(first) : "");
        System.out.println(result);
    }
}