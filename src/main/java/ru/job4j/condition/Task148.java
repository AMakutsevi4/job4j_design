package ru.job4j.condition;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int index = 0;
        int x = 0;
        int y = 0;
        int rsl = 0;
        while (children > 0 && adults > 0) {
            if (children - cNum[index] < 0 || adults - aNum[index] < 0) {
                break;
            }
            children -= cNum[index];
            x += cNum[index];
            adults -= aNum[index];
            y += aNum[index++];
            rsl++;
        }
        System.out.printf("Группы: %d, Взрослых: %d, детей: %d, осталось билетов взр: %d, осталось билетов дет: %d%n", rsl, y, x, adults, children);
    }
}
