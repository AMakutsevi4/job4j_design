package ru.job4j.condition;

public class Task47 {
    public static void changeNum(int number) {
        System.out.println(number > 500
                ? Integer.valueOf("" + number % 10  + number / 10 % 10 +   number / 100)
                :  "" + number / 100 + number % 10 + number / 10 % 10);
    }
}

