package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int rsl = 0;
        for (int i : data) {
            if (el == i) {
              break;
            }
            rsl = rsl + i;
        }
        return rsl % 2 == 0 ? rsl : 0;
    }
}
