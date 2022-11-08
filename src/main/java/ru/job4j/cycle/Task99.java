package ru.job4j.cycle;

public class Task99 {
    public static void loop(int[] num) {
        int rsl = (num[4] + num[3] + num[2]) / 3;
        int sumAll = 0;
       for (int j : num) {
           sumAll += j;
    }
       System.out.println(sumAll / num.length > rsl ? "Больше" : "Нет");
    }
}
