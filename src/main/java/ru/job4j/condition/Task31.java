package ru.job4j.condition;

public class Task31 {
    public static void numCompare(int num1, int num2) {
        System.out.println(num1 > num2 ? num2 + " " + num1
                + System.lineSeparator()
                + num1 + " " + num2
                :
                num1 + " " + num2
                        + System.lineSeparator()
                        + num2 + " " + num1);
    }
}
