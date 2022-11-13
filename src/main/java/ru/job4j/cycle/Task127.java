package ru.job4j.cycle;

public class Task127 {
    public static void loop(int num) {
        if (num > 999) {
            System.out.println(num / 1000);
        }
        else if (num > 99) {
            System.out.println(num / 100);
        }
         else if (num > 9) {
            System.out.println(num / 10);
        } else {
            System.out.println(num);
        }
    }
}
