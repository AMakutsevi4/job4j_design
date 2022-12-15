package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        int one = num1;
        int count = 0;
        int index = 0;
        if (num1 < num2) {
            System.out.println("Подсчет не производится");
        } else {
            while (num1 > 0) {
                num1 -= num2;
                count++;
            }
            while (one > num2) {
                one -= num2;
                index++;
            }
            System.out.println(num1 == 0 ? count : index + " " + one + "/" + num2);
        }
    }
}





