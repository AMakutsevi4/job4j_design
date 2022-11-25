package ru.job4j.condition;

public class Task77 {
    public static void diffNumAmount(int num) {
        int one = num / 100;
        int teo = num / 10 % 10;
        int three = num % 10;
        int rsl = 0;
        if (one != teo) {
            rsl++;
        }
        if (one != three && teo != three) {
            rsl++;
        }
        if (teo != three && one != teo) {
            rsl++;
        }
        System.out.println(rsl);
    }
}