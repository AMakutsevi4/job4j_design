package ru.job4j.array;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        char[] temp = ("" + number1).toCharArray();
        char[] chars1 = ("" + number1).toCharArray();
        char[] chars2 = ("" + number2).toCharArray();

        chars1[0] = chars2[0];
        chars2[0] = temp[0];
        System.out.println(chars1);
        System.out.println(chars2);
    }

}