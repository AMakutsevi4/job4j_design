package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        int count = 0;
        int one = num4 / 1000;
        int two = num4 / 100 % 10;
        int three = num4 / 10 % 10;
        int four = num4 % 10;
        int uno = Integer.parseInt(one + "" + two);
        int dos = Integer.parseInt(two + "" + three);
        int tres = Integer.parseInt(three + "" + four);
        if (uno == num2) {
            count++;
        }
        if (dos == num2) {
            count++;
        }
        if (tres == num2) {
            count++;
        }
        System.out.println(count);
    }
}
