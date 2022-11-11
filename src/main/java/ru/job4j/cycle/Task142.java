package ru.job4j.cycle;

public class Task142 {
    public static void loop(int num) {
        var n0 = 0;
        var n1 = 1;
        var n2 = 0;
        for (int i = 2; i <= num; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            if (n2 >= num) {
                break;
            }
        }
        if (n2 == num || num == 2 || num == 1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
