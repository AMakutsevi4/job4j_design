package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                a += players[i];
            } else {
                b += players[i];
            }
        }
        if (a == b) {
            return 0;
        }
        return a > b ? 1 : 2;
    }
}
