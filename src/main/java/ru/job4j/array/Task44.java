package ru.job4j.array;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        char[] temp = ("" + number1).toCharArray();
        char[] chars1 = ("" + number1).toCharArray();
        char[] chars2 = ("" + number2).toCharArray();

        chars1[chars1.length - 1] = chars2[chars2.length - 1];
        chars2[chars2.length - 1] = temp[temp.length - 1];
        System.out.println(chars1);
        System.out.println(chars2);
    }
}
